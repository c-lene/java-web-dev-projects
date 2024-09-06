package org.launchcode;

import java.util.Scanner;

// Check Your Understanding Question
public class QuizQuestion {
    public static void main(String[] args) {

        System.out.println("Are you a Space Cadet? yes or no");
        Scanner in = new Scanner(System.in);
        String response = in.next();

        switch (response) {
            case "yes":
                System.out.println("Greetings cadet.");
            case "no":
                System.out.println("Greetings normie.");
            default:
                System.out.println("Are you an alien?");
        }
    }
}
