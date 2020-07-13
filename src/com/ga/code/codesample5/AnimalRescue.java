package com.ga.code.codesample5;

import java.util.ArrayList;
import java.util.List;

public class AnimalRescue {
    private List<Dog> dogs;
    private Manager manager;
    private Employee employee;

    public AnimalRescue(Manager manager, Employee employee) {
        this.dogs = new ArrayList<Dog>();
        this.manager = manager;
        this.employee = employee;
    }

    public Dog rescueDog(Dog dog) {
        this.dogs.remove(dog);

        return dog;
    }

    public void feedDogs() {
        for (Dog dog : this.dogs) {
            if (dog instanceof BigDog) {
                this.manager.feed(dog);
            } else {
                this.employee.feed(dog);
            }
        }
    }
}
