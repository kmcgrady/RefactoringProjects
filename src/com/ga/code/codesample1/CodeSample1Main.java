package com.ga.code.codesample1;

import java.util.LinkedList;

public class CodeSample1Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Do Laundry");
        linkedList.add("Buy Groceries");
        linkedList.add("Take out trash");

        TodoList todos = new TodoList(linkedList);

        todos.printTasks();
    }
}
