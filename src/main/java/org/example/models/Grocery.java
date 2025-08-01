package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void startGrocery() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter 0 to quit, 1 to add items, 2 to remove items:");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter items to add (separate by commas if multiple):");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("Enter items to remove (separate by commas if multiple):");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (!checkItemIsInList(item)) {
                groceryList.add(item);
            }
        }
        printSorted();
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (checkItemIsInList(item)) {
                groceryList.remove(item);
            }
        }
        printSorted();
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Sorted Grocery List: " + groceryList);
    }

    public static void main(String[] args) {
        startGrocery();
    }
}