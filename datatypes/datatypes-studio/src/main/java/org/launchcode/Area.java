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


        // Bonus Mission - Validation
        System.out.println("Please enter a radius:");

        if (input.hasNextDouble()) {
            radius = input.nextDouble();

            if (radius > 0) {
                areaOfCircle = Circle.getArea(radius);
                System.out.println("The Area of a Circle with a Radius of " + radius + " is: " + areaOfCircle);
            } else {
                System.out.println("The entered Radius should be a POSITIVE number and is NOT a valid input!");
            }

        } else {
            System.out.println("The entered Radius is NOT a valid input!");
        }

        input.close();
    }
}
