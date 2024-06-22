package com.javacoreconcepts.inheritance;

public class Animal {
    private String name;
    private int id;
    private String breed;

    public Animal(String name, int id, String breed) {}

    public String getName() {
        System.out.println("Get Name from Animal");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        System.out.println("Get id from Animal");
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        System.out.println("Get breed from Animal");
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
