package org.launchcode;

import java.util.Scanner;

public class Area {

    static void numValidation(String radius) {

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double areaOfCircle;


        // Original Code
//        System.out.println("Enter a radius:");
//        double radius = input.nextDouble();
//
//        double areaOfCircle = Circle.getArea(radius);
//        System.out.println("The Area of a Circle with a Radius of " + radius + " is: " + areaOfCircle);


        // Bonus Mission #1 - Validation
//        System.out.println("Please enter a radius:");
//
//        // Checks if input is a NUMBER
//        if (input.hasNextDouble()) {
//            radius = input.nextDouble();
//
//            // Checks if input is a POSITIVE number
//            if (radius > 0) {
//                areaOfCircle = Circle.getArea(radius);
//                System.out.println("The Area of a Circle with a Radius of " + radius + " is: " + areaOfCircle);
//            } else {
//                System.out.println("The entered Radius should be a POSITIVE number and is NOT a valid input!");
//            }
//
//        } else {
//            System.out.println("The entered Radius is NOT a valid number!");
//        }


        // Bonus Mission #2 - Using Loops to Re-prompt
        do {
            System.out.println("Please enter a POSITIVE number for the Radius: ");

            // Using While Loop to ensure input is a NUMBER
            while (!input.hasNextDouble()) {
                System.out.println("Invalid Input. The Radius muse be a NUMBER! Try again!");
                input.next();
            }
            radius = input.nextDouble();

        } while (radius < 0);

        areaOfCircle = Circle.getArea(radius);
        System.out.println("The Area of a Circle with a Radius of " + radius + " is: " + areaOfCircle);

        input.close();
    }
}
