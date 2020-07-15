package com.ga.code.codesample2;

public class CodeSample2Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Fred's Budget");
        myPerson.addAccount("Bank of America", 200000);
        myPerson.addAccount("US Bank", 50000);
        myPerson.addAccount("Homestreet Bank", 250000);

        printSummary(myPerson);
    }

    public static void printSummary(Person person) {
        person.printSummary();
    }

}
