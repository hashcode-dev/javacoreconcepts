package com.javacoreconcepts.statickeyword;

public class StaticKeywordDemo {

    //Static method
    public static void myStaticMethod(){
        System.out.println("My static method");
    }

    //Non-Static method
    //Cannot be called without an instance of the class
    public void displayMessage(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        myStaticMethod();
        StaticKeywordDemo staticKeywordDemo = new StaticKeywordDemo();
        staticKeywordDemo.displayMessage();
    }
}
