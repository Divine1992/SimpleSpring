package com.separate.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CommonAppConfg.class);
        Service service = (Service) context.getBean("restService");
        service.getMethod();
    }
}
