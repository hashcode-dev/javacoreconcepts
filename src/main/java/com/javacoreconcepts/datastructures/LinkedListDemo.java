package com.javacoreconcepts.datastructures;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        //Addition of elements
        linkedList.add("Gaurav");
        linkedList.add("Priyanka");
        linkedList.add("Prakhar");
        linkedList.add("Shrisha");
        linkedList.add("Meena");
        //Iteration of elements
        linkedList.forEach(li -> {
            System.out.println("List Item: " + li);
        });
        //Update operation
        System.out.println("Updating elements");
        linkedList.set(1, "Priyanka Updated");
        linkedList.forEach(li -> {
            System.out.println("List Item: " + li);
        });
        //Removal of object
        System.out.println("Removing elements");
        linkedList.remove("Gaurav");
        linkedList.remove(2);
        linkedList.forEach(li -> {
            System.out.println("List Item: " + li);
        });

    }
}
