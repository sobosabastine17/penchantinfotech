package org.task1;

import java.util.Scanner;
public class NumberGame {


        public static void main(String[] args) {
            numberSelected();
        }

        public static void numberSelected() {
            // Step 1: Generate a random number between 1 and 100
            int selectedNumber = (int) (Math.random() * 100) + 1;
            Scanner userInput = new Scanner(System.in);
            int userNumber = 0;

            System.out.println("Welcome to penchant info tech Number Guessing Game!");
            System.out.println("---------------------------------------------");
            System.out.println("Try to guess the number selected by the computer.");

            // Step 2: Loop until the correct number is guessed
            while (userNumber != selectedNumber) {
                System.out.print("Guess the Number Selected: ");
                try {
                    userNumber = userInput.nextInt();
                    // Step 3: Check the player's guess
                    if (userNumber != selectedNumber) {
                        System.out.println("OOOPS! Please try guess again.");
                    } else {
                        System.out.println("Congratulations! You've guessed the number");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    userInput.next(); // Clear invalid input
                }
            }

            userInput.close();
        }
    }

