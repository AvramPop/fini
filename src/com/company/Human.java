package com.company;

public abstract class Human {
    private int age;
    String name;
    String cnp;

    Human() {}

    Human(String name){
        this.name = name;
    }

    Human(String name, int age){
        this.name = name;
        this.age = age;
        cnp = String.valueOf(age * 1000 + 22);
        System.out.println("Hello! I've just been born. My name is " + name);
    }

    void sayHello(){
        System.out.println("Hello! I'm a human being.");
    }

    void sayCNP(){
        System.out.println("My CNP is "  + cnp);
    }

    void sayAge(){
        System.out.println("My age is " + age);
    }

    void sayAgeAfterYears(int years){
        int ageAfterYears = age + years;
        System.out.println("My age will be " + ageAfterYears);
    }

    void setAge(int newAge){
        age = newAge;
    }

    int getAge(){
        return age;
    }
}
