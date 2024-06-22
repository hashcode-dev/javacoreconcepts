package com.javacoreconcepts.inheritance;

public class Dog extends Animal{
    private String name;
    private String breed;
    private int id;

    public Dog(String name, String breed, int id) {
        super(name, id, breed);
        this.breed = breed;
        this.id = id;
        this.name = name;
    }

    @Override
    public String getName() {
        super.getName();
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        super.getId();
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getBreed() {
        super.getBreed();
        return breed;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
