package com.javacoreconcepts.statickeyword;

public class StaticBlockExample {
    private static int number;
    private static String myString;

    static {
        System.out.println("static block 1");
        number = 45;
        myString = "Hello World!";
    }

    static {
        System.out.println("static block 2");
        number = 55;
        myString = "Hello World! in Block 2";
    }

    public static void main(String[] args) {
        System.out.println("Value of myString: " + myString);
        System.out.println("Value of number: " + number);
    }

}
