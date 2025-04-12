package com.javacoreconcepts.algorithms;

import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15, 5};
        int target = 18;
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int secondNumber = target - array[i];
            if (map.containsKey(secondNumber)) {
                answer[0] = map.get(secondNumber);
                answer[1] = i;
                break;
            } else {
                map.put(array[i], i);
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}
