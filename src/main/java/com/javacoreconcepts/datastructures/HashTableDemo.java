package com.javacoreconcepts.datastructures;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Gaurav", 10224);
        hashtable.put("Prakhar", 10225);
        hashtable.put("Priyanka", 10226);
        hashtable.put("Veda", 10227);
        hashtable.put("Papa", 10228);
        System.out.println("Hash Table: " + hashtable);
    }
}
