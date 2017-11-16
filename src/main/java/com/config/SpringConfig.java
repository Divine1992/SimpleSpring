package com.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean("jsonParser")
    public JsonParser jsonParser(){
        return new JsonParser();
    }

    @Bean("xmlParser")
    public XmlParser xmlParser(){
        return new XmlParser();
    }

}
