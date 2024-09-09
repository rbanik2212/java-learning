package com.example.springbootprac.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

//lazy intialization, basically this bean will be created when we specifically asked too, but won't
// otherwise
@Lazy
public class Artist implements Huamn{
    @Override
    public String sayHello() {
        return null;
    }
}
