package com.example.ms17;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
