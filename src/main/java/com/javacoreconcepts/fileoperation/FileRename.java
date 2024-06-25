package com.javacoreconcepts.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FileRename {
    public static void main(String[] args) {
        // Replace with the path to your folder
        String folderPath = "/Users/gauravsahu/Downloads/BulkVideos";
        // Replace with the name of your CSV file
        String csvFilePath = "/Users/gauravsahu/Downloads/filerename.csv";

        Map<String, String> renameMap = readCsvFile(csvFilePath);

        if (renameMap != null) {
            renameFiles(folderPath, renameMap);
        }
    }

    // Method to read the CSV file and create a map of old to new file names
    private static Map<String, String> readCsvFile(String csvFilePath) {
        Map<String, String> renameMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] names = line.split(",");
                if (names.length == 4) {
                    renameMap.put(names[1], names[2]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
            return null;
        }
        return renameMap;
    }

    // Method to rename files based on the map
    private static void renameFiles(String folderPath, Map<String, String> renameMap) {
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("The specified folder does not exist or is not a directory.");
            return;
        }

        for (Map.Entry<String, String> entry : renameMap.entrySet()) {
            File oldFile = new File(folderPath + File.separator + entry.getKey());
            File newFile = new File(folderPath + File.separator + entry.getValue());

            if (oldFile.exists()) {
                if (oldFile.renameTo(newFile)) {
                    System.out.println("Renamed: " + entry.getKey() + " -> " + entry.getValue());
                } else {
                    System.out.println("Failed to rename: " + entry.getKey());
                }
            } else {
                System.out.println("File not found: " + entry.getKey());
            }
        }
    }
}
