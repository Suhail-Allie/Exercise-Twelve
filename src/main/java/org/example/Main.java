package org.example;

import java.util.Random;

public class Main {

    // Method to get a random number between 1 and 54, excluding given numbers
    public static int getRandom(int... excludedNumbers) {
        Random random = new Random();
        boolean[] excluded = new boolean[55];

        // Mark excluded numbers
        for (int num : excludedNumbers) {
            if (num >= 1 && num <= 54) {
                excluded[num] = true;
            }
        }

        int number;
        do {
            number = random.nextInt(54) + 1; // Generate number between 1 and 54
        } while (excluded[number]); // If number is excluded, try again

        return number;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Random number: " + getRandom(3, 7, 12, 25));
    }
}
