package com.javacoreconcepts.inheritance;

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", "Brown", 1);
        System.out.println("Get Name from Dog: " + dog.getName());
        System.out.println("Get Id from Dog: " + dog.getId());
        System.out.println("Get Breed from Dog: " + dog.getBreed());
    }
}
