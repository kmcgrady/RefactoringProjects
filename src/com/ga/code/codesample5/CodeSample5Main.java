package com.ga.code.codesample5;

public class CodeSample5Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Kim");
        Employee employee = new Employee("Dave");
        AnimalRescue animalRescue = new AnimalRescue(manager, employee);
        animalRescue.rescueDog(new Dog("Spot"));
        animalRescue.rescueDog(new BigDog("Patch", 80));
        animalRescue.rescueDog(new Dog("Lucky"));
        animalRescue.rescueDog(new Dog("Pongo"));
        animalRescue.rescueDog(new BigDog("Perdita", 90));

        animalRescue.feedDogs();
    }
}
