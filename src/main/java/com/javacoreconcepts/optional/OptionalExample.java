package com.javacoreconcepts.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String value = "Hello, World!";
        Optional<String> optional = Optional.ofNullable(value);

        // Check if the value is present and print it
        if (optional.isPresent()) {
            System.out.println("Value is present: " + optional.get());
        } else {
            System.out.println("Value is absent");
        }

        // Using the 'orElse' method to provide a default value if the optional is empty
        String result = optional.orElse("Default Value");
        System.out.println("Result: " + result);
    }

}
