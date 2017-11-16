package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation-config.xml");
        CarService carService = (CarService) context.getBean("carService");
        carService.run();
    }
}
