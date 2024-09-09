package com.example.springbootprac.common;


//used for java config bean **NO @Component annotation
public class Nurse implements Huamn{
    @Override
    public String sayHello() {
        return "Hello i am a nurse";
    }

}
