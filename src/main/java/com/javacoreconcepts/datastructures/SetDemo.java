package com.javacoreconcepts.datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    //Add elements to set
    public void addElementToSet(Set<String> set){
        set.add("Gaurav");
        set.add("Prakhar");
        set.add("Mummy");
        set.add("Papa");
        set.add("Veda");
        set.add("Priyanka");
    }

    //Read elements from Set
    public void readElementsOfSet(Set<String> set){
        set.forEach(s -> {
            System.out.println("Entry: " + s);
        });
    }

    //Intersection of elements
    public void findIntersectingElements(Set<String> set){
        Set<String> anotherSet = new HashSet<>();
        anotherSet.addAll(Arrays.asList("Geek", "for", "testing", "Gaurav"));
        Set<String> intersectingSet = new HashSet<>(set);
        intersectingSet.retainAll(anotherSet);
        System.out.println("Intersecting Set: " + intersectingSet);
    }

    public void unionOfElements(Set<String> set){
        Set<String> anotherSet = new HashSet<>();
        anotherSet.addAll(Arrays.asList("Geek", "for", "testing", "Gaurav"));
        Set<String> unionSet = new HashSet<>(set);
        unionSet.addAll(anotherSet);
        System.out.println("Union Set: " + unionSet);
    }

    public void differenceOfSet(Set<String> set){
        Set<String> anotherSet = new HashSet<>();
        anotherSet.addAll(Arrays.asList("Geek", "for", "testing", "Gaurav"));
        Set<String> diffSet = new HashSet<>(set);
        diffSet.removeAll(anotherSet);
        System.out.println("Difference Set: " + diffSet);
    }

    public static void main(String[] args) {
        Set<String> demoSet = new HashSet<>();
        SetDemo setDemo = new SetDemo();
        setDemo.addElementToSet(demoSet);
        setDemo.differenceOfSet(demoSet);
        setDemo.unionOfElements(demoSet);
        setDemo.readElementsOfSet(demoSet);
        setDemo.findIntersectingElements(demoSet);
    }
}
