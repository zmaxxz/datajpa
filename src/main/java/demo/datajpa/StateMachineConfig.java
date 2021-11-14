/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package demo.datajpa;


import demo.datajpa.util.StateMachineFileConfigGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineModelConfigurer;
import org.springframework.statemachine.config.model.StateMachineModel;
import org.springframework.statemachine.config.model.StateMachineModelFactory;
import org.springframework.statemachine.data.*;
import org.springframework.statemachine.data.jpa.JpaPersistingStateMachineInterceptor;
import org.springframework.statemachine.data.jpa.JpaStateMachineRepository;
import org.springframework.statemachine.data.support.StateMachineJackson2RepositoryPopulatorFactoryBean;
import org.springframework.statemachine.persist.StateMachineRuntimePersister;
import org.springframework.statemachine.service.DefaultStateMachineService;
import org.springframework.statemachine.service.StateMachineService;

import java.io.IOException;

@Configuration

public class StateMachineConfig {


    @Autowired
    private ResourceLoader rl;
    @Bean
    public StateMachineRuntimePersister<String, String, String> stateMachineRuntimePersister(
            JpaStateMachineRepository jpaStateMachineRepository) {
        return new JpaPersistingStateMachineInterceptor<>(jpaStateMachineRepository);
    }

    @Bean
    public StateMachineService<String, String> stateMachineService(
            @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection") StateMachineFactory<String, String> stateMachineFactory,
            StateMachineRuntimePersister<String, String, String> stateMachineRuntimePersister) {
        return new DefaultStateMachineService<String, String>(stateMachineFactory, stateMachineRuntimePersister);
    }
    //tag::snippetA[]
    @Bean
    public StateMachineJackson2RepositoryPopulatorFactoryBean jackson2RepositoryPopulatorFactoryBean() throws IOException {

        //StateMachineFileConfigGenerator.generateFrom();

        StateMachineJackson2RepositoryPopulatorFactoryBean factoryBean = new StateMachineJackson2RepositoryPopulatorFactoryBean();
        factoryBean.setResources(new Resource[]{new ClassPathResource("statemachine_config.json")});
        return factoryBean;
    }





    //end::snippetA[]

    //tag::snippetB[]
    @Configuration
    @EnableStateMachineFactory
    public class Config extends StateMachineConfigurerAdapter<String, String> {

        @Autowired
        public Actions actions;

        @Autowired
        private StateRepository<? extends RepositoryState> stateRepository;

        @Autowired
        private TransitionRepository<? extends RepositoryTransition> transitionRepository;

        @Autowired
        private StateMachineRuntimePersister<String, String, String> stateMachineRuntimePersister;

        @Override
        public void configure(StateMachineConfigurationConfigurer<String, String> config)
                throws Exception {
            config
                    .withConfiguration()
                    .autoStartup(true)

                    .and()
                    .withPersistence()
                    .runtimePersister(stateMachineRuntimePersister);

        }

        @Override
        public void configure(StateMachineModelConfigurer<String, String> model) throws Exception {
            model
                    .withModel()
                    .factory(modelFactory());
        }

        @Bean
        public StateMachineModelFactory<String, String> modelFactory() {
            return new RepositoryStateMachineModelFactory(stateRepository, transitionRepository){

                @Override
                public StateMachineModel<String, String> build(String machineId) {
                    machineId=null;
                    return super.build(machineId);
                }
            };
        }


    }
//end::snippetB[]
}
