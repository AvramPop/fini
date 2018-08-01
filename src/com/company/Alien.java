package com.company;

public class Alien extends Person {
    Alien() {
        super();
    }

    Alien(String name) {
        super(name);
    }

    Alien(String name, int age) {
        super(name, age);
    }

    @Override
    void sayHello() {
        System.out.println("Hello! I'm an alien.");
    }
}
