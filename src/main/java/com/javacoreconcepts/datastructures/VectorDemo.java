package com.javacoreconcepts.datastructures;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(1);
        integerVector.add(2);
        integerVector.add(3);
        integerVector.add(4);
        integerVector.add(5);
        System.out.println("Vector Demo: " + integerVector);
    }
}
