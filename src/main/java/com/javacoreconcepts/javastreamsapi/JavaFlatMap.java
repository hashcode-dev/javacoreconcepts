package com.javacoreconcepts.javastreamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFlatMap {
    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        List<String> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(flattenedList);

    }
}
