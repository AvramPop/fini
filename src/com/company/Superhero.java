package com.company;

public class Superhero extends Person {
    Superhero() {
        super();
    }

    Superhero(String name) {
        super(name);
    }

    void saySuperpower(){
        System.out.println("Superpower");
    }

    @Override
    void sayHello() {
        System.out.println("Hello! I'm a bat.");
    }
}
