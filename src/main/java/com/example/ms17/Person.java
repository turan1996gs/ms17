package com.example.ms17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.SocketHandler;

@Component
public class Person {

   private Pet pet;

   public Person() {
       System.out.println("Person bean is created");
    }

    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person setter");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
