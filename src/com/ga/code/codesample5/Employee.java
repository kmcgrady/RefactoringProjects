package com.ga.code.codesample5;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(Dog dog) {
        System.out.println(this.getName() + " is feeding " + dog.getName());
    }
}
