package com.annotation;

import org.springframework.stereotype.Component;

@Component("nativeCar")
public class NativeCar implements Car {

    public void run() {
        System.out.println("This is our car");
    }
}
