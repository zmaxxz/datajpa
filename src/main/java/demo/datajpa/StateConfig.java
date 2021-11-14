package demo.datajpa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class StateConfig {

    public String transitionTargetState;
    public String transitionTargetStateEvent;
    public Message messages;
    public Request request;
    public String button;

}
@NoArgsConstructor
@Getter
@Setter
@ToString
class Request {

    public String classModelString;
    public String method;
    public String expressionString;

}
@NoArgsConstructor
@Getter
@Setter
@ToString
class Message {

    public String onEnter;
    public String onError;

}
