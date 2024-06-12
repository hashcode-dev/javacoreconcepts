package com.javacoreconcepts.statickeyword;

public class StaticVariableExample {

    private static int number;
    private static String myString;

    static {
        System.out.println("static block 1");
        number = 45;
        myString = "Hello World!";
    }

    public static void main(String[] args) {
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        System.out.println("Object 1 Number: " + obj1.number);
        System.out.println("Object 1 myString: " + obj1.myString);
        System.out.println("Object 2 Number: " + obj2.number);
        System.out.println("Object 2 myString: " + obj2.myString);

    }
}
