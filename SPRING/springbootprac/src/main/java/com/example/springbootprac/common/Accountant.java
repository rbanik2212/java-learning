package com.example.springbootprac.common;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Accountant implements Huamn{



/*  @PostConstruct and @PreDestory are bean lifecycle annotation which allow for methods to
*   be run before the bean is instantiated but....
* For "prototype" scoped beans, Spring does not call the destroy method.
* */
    @PostConstruct
    public String beanInit(){
        return "i am a messaege before the bean is instaniated";
    }

    @PreDestroy
    public String beanDestroy(){
        return "I am a bean that is getting destroyed";
    }

    @Override
    public String sayHello() {
        return "hello i am an accountant";
    }
}
