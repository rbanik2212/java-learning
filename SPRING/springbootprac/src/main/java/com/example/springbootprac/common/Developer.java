package com.example.springbootprac.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Developer implements Huamn {



//    This works as @Primary was added onto Developer,  also can only be 1 primary for the same interfaces classes
//    primarybean, but qualifers have higher priority + more specific
    @Override
    public String sayHello() {
        return "Saying hello as a DEVELOPER!";
    }
}
