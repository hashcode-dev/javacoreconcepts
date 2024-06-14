package com.javacoreconcepts.constructors;

public class ConstructorsDemo {

    private String myString;
    private int myInteger;

    public ConstructorsDemo(String myString, int myInteger) {
        this.myString = myString;
        this.myInteger = myInteger;
    }

    public ConstructorsDemo(){

    }

    public int getMyInteger() {
        return myInteger;
    }

    public void setMyInteger(int myInteger) {
        this.myInteger = myInteger;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

}
