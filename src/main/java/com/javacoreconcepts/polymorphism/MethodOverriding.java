package com.javacoreconcepts.polymorphism;

//In order to override
//Method signature must be exactly same
public class MethodOverriding extends MethodOverloading{

    private String name;
    private String surName;

    public MethodOverriding(String name, String surName) {
        super(name, surName);
        this.name = name;
        this.surName = surName;
    }

    @Override
    public void disPlayName() {
        super.disPlayName();
        System.out.println("MethodOverriding Name: " + name);
    }

    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding("John", "Doe");
        methodOverriding.disPlayName();
    }
}
