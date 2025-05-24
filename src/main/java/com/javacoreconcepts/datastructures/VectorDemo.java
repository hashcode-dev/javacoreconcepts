package com.javacoreconcepts.datastructures;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();
        //Add operations
        integerVector.add(1);
        integerVector.add(2);
        integerVector.add(3);
        integerVector.add(4);
        integerVector.add(5);
        System.out.println("Vector Add Object Demo: " + integerVector);
        //Update operation
        integerVector.set(0,12);
        System.out.println("Vector Update Object Demo: " + integerVector);
        //Delete operation
        integerVector.remove(1);
        integerVector.remove(Integer.valueOf(2));
        System.out.println("Vector Delete Object Demo: " + integerVector);
        //Iterations
        integerVector.forEach(integer -> {
            System.out.println("Element:" + integer);
        });
    }
}
