package com.anp.exception;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Enter the user to input a string
            System.out.print("Enter a string to reverse: ");
            String userInput = scanner.nextLine();

            // Checking if the user input is not null and not empty
            if (userInput != null && !userInput.isEmpty()) {
                // Reversing the input string using the reverseString method
                String reversedString = reverseString(userInput);
                System.out.println("Reversed string: " + reversedString);
            } else {
                System.out.println(" Enter a non-empty string.");
            }
        } catch (Exception e) {
            // Catching any exception that might occur during string reversal
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Ensuring the Scanner is closed to prevent resource leaks
            scanner.close();
        }
    }

    // Method to reverse the input string
    public static String reverseString(String input) {
        // Checking if the input string is null or empty
        if (input == null || input.isEmpty()) {
            // Throwing an IllegalArgumentException if the input is invalid
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        // Using StringBuilder to efficiently build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Reversing the input string character by character
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Returning the reversed string
        return reversed.toString();
    }
}