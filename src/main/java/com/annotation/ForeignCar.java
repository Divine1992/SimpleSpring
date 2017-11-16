package com.annotation;

import org.springframework.stereotype.Component;

@Component("foreignCar")
public class ForeignCar implements Car {

    public void run() {
        System.out.println("Comfortable run");
    }
}
