package com.ga.code.codesample1;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<String>();
    }

    public TodoList(ArrayList<String> initialTasks) {
        this.tasks = initialTasks;
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    public void printTasks() {
        System.out.println("My ToDo List");
        System.out.println("------------");
        for(int i = 0; i < this.tasks.size(); i++) {
            System.out.println((i + 1) + ". " + this.tasks.get(i));
        }
    }
}
