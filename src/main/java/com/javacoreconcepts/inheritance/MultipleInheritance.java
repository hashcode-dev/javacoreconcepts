package com.javacoreconcepts.inheritance;

public class MultipleInheritance //implements InterfaceA, InterfaceB
    {

        //Even though multiple inheritance is allowed in case of interfaces
        //event then also this case will fail at compile time
        //because of the ambiguity as both interfaces have methods which has same name
        //which is methodA() and methodB()

    //'methodA()' in 'com.javacoreconcepts.inheritance.MultipleInheritance' clashes with 'methodA()' in
    // 'com.javacoreconcepts.inheritance.InterfaceB'; attempting to use incompatible return type
//    @Override
//    public void methodA() {
//
//    }

    //'methodB()' in 'com.javacoreconcepts.inheritance.MultipleInheritance' clashes with 'methodB()'
    //in 'com.javacoreconcepts.inheritance.InterfaceB'; attempting to use incompatible return type
//    @Override
//    public void methodB() {
//
//    }
}
