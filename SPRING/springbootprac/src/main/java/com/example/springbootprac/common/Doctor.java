package com.example.springbootprac.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//setting the bean lifecycle, default is "Signleton" and "Prototype"
// prototype create multiple instances of the same bean, while singleton only create one instance
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Doctor implements Huamn{
    @Override
    public String sayHello() {
        return "Hello I am a doctor";
    }
}
