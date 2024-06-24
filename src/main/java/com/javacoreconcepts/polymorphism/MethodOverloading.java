package com.javacoreconcepts.polymorphism;
//For over loading
//method name should be same
//signature must be different
//just keeping different return type
//is not enough
public class MethodOverloading {
    private String name;
    private String surName;

    public MethodOverloading(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void disPlayName(){
        System.out.println("Name: " + name);
    }

    //Even though the return type is different from above method
    //event then this will show compile time error
    //this situation can be asked in interview
    //public String disPlayName(){
    //    return name;
    //}

    public String disPlaySurName(String newSurname){
        this.surName = newSurname;
        return surName;
    }

    public void disPlayName(String newName){
        this.name = newName;
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

    }
}
