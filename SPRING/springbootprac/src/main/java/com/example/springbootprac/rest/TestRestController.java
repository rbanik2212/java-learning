package com.example.springbootprac.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootprac.common.Developer;
import com.example.springbootprac.common.Doctor;
import com.example.springbootprac.common.Huamn;


@RestController
public class TestRestController {

//    below is an example of field injection
//    @Autowired
//     private Huamn aDeveloper;

    private Huamn aPerson;
    private Huamn aPerson2;
    private Huamn aPerson3;


    //    constructor injection
//    a Qualifer added becoause there are more than one classes that uses the Huamn interface: ambugity
//    @Autowired
//    public TestRestController(@Qualifier("doctor") Huamn aPer, @Qualifier("doctor") Huamn aPer2, @Qualifier("accountant") Huamn aPer3) {
//        aPerson = aPer;
//        aPerson2 = aPer2;
//        aPerson3 = aPer3;
//    }


//    @Autowired
//    public TestRestController(Huamn aPer){
//        aPerson = aPer;
//    }

//    used for @Bean configuration
    @Autowired
    public TestRestController(@Qualifier("nurse1") Huamn aPer){
        aPerson = aPer;
    }


//    setter injection
//    @Autowired
//    public void setDev(Developer adev){
//        this.aDeveloper = adev;
//    }


    @GetMapping("/check")
    public String checking() {
        return "checking if both doctor beans are the same " + (aPerson == aPerson2);
    }

    @GetMapping("/nurse")
    public String helloNurse(){
        return aPerson.sayHello();
    }

    @GetMapping("/")
    public String hello() {
        return aPerson2.sayHello();
    }

    @GetMapping("/workout")
    public String workout() {
        return "went to gym";
    }

    @GetMapping("/fort")
    public String fortune() {
        return "today is your lucky";
    }

    //    look at application.properties file
    @GetMapping("${end.name}")
    public String test() {
        return "this is a test endpoint";
    }
}
