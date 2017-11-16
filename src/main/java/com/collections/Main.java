package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection-config.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }
}
