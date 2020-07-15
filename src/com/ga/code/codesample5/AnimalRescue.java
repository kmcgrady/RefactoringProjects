package com.ga.code.codesample5;

import java.util.ArrayList;
import java.util.List;

public class AnimalRescue {
    private List<Dog> dogs;
    private List<BigDog> bigDogs;
    private Manager manager;
    private Employee employee;

    public AnimalRescue(Manager manager, Employee employee) {
        this.dogs = new ArrayList<Dog>();
        this.bigDogs = new ArrayList<BigDog>();
        this.manager = manager;
        this.employee = employee;
    }

    public Dog rescueDog(Dog dog) {
        this.dogs.add(dog);

        return dog;
    }

    public Dog rescueDog(BigDog dog) {
        this.bigDogs.add(dog);

        return dog;
    }

    public void feedDogs() {
        for (Dog dog : this.dogs) {
            this.employee.feed(dog);
        }

        for (BigDog dog : this.bigDogs) {
            this.manager.feed(dog);
        }
    }
}
