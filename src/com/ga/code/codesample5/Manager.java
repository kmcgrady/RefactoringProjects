package com.ga.code.codesample5;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void feed(BigDog dog) {
        System.out.println(this.getName() + " is feeding " + dog.getName() + " with extra food.");
    }
}
