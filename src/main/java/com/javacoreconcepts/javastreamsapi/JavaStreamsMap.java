package com.javacoreconcepts.javastreamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsMap {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello world", "Java streams");
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLengths);

    }
}
