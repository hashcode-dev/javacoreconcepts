package com.javacoreconcepts.codilitytest;

import java.util.HashSet;
import java.util.Set;

public class MessageCleaner {
    public static String cleanMessage(String dictionary, String message) {
        Set<String> validWords = new HashSet<>();

        // Populate the dictionary set with normalized (TitleCase) words
        for (String word : dictionary.split(" ")) {
            validWords.add(word);
        }

        // Process the message
        StringBuilder cleanedMessage = new StringBuilder();
        for (String word : message.split(" ")) {
            // Normalize word to TitleCase to match dictionary format
            String normalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);

            if (validWords.contains(normalizedWord)) {
                cleanedMessage.append(word);
            } else {
                cleanedMessage.append("###");
            }
            cleanedMessage.append(" ");
        }

        // Remove trailing space
        return cleanedMessage.toString().trim();
    }

    public static void main(String[] args) {
        String dictionary = "The Codility Coders Test";
        String message = "Codility tests the codes of coders";

        System.out.println("Dictionary: " + dictionary);
        System.out.println("message: " + message);

        String result = cleanMessage(dictionary, message);
        System.out.println("Cleaned Message: " + result);
    }
}
