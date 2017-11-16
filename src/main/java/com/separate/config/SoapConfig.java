package com.separate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {

    @Bean
    public SoapService soapService(){
        return new SoapService();
    }
}
