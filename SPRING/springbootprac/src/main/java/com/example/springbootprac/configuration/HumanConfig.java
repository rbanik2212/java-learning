package com.example.springbootprac.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.springbootprac.common.Huamn;
import com.example.springbootprac.common.Nurse;


/* Here we are configuring our own bean instead of using @Component
* This is useful for 3rd party classes
* */
@Configuration
public class HumanConfig {
    @Bean("nurse1")
    public Huamn nurse() {
        return new Nurse();
    }
}
