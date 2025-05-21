package com.javacoreconcepts.datastructures;

import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractListDemo {
    public static void main(String[] args) {
        AbstractList<String> abstractList = new ArrayList<>();
        abstractList.add("Gaurav Sahu");
        System.out.println("Names:" + abstractList);
    }
}
