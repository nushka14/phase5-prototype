package com.phase5;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class phase5 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, String> historicalData = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to EffortLogger!");

        // Simulate user onboarding
        System.out.print("Do you have an account? (yes/no): ");
        String hasAccount = scanner.nextLine().trim().toLowerCase();
        
        if ("no".equals(hasAccount)) {
            System.out.println("Creating a new account...");
            // Further account creation logic would go here
        } else {
            System.out.println("Please log in...");
            // Further login logic would go here
        }

        // Display user dashboard
        System.out.println("User dashboard displayed...");

        // Simulate historical data retrieval
        loadHistoricalData(); // Simulate loading historical data
        System.out.print("Enter a keyword to search for relevant historical projects: ");
        String keyword = scanner.nextLine().trim();

        searchHistoricalData(keyword); // Perform search based on keyword

        scanner.close();
    }

    private static void loadHistoricalData() {
        // Simulate loading historical data from a database
        historicalData.put("Project Alpha", "Implemented login feature with two-factor authentication.");
        historicalData.put("Project Beta", "Designed and deployed microservice architecture.");
        historicalData.put("Project Gamma", "Refactored database schema for performance improvements.");
    }

    private static void searchHistoricalData(String keyword) {
        System.out.println("Searching for projects related to: " + keyword);
        // Simple keyword search in historical project descriptions
        boolean found = false;
        for (Map.Entry<String, String> entry : historicalData.entrySet()) {
            if (entry.getValue().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found related project: " + entry.getKey() + " - " + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No related projects found.");
        }
    }
}
