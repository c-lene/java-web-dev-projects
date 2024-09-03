package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles driven?");
        Double numMilesDriven = input.nextDouble();

        System.out.println("How many gallons of gas consumed?");
        Double numGallonsConsumed = input.nextDouble();

        double mpg = numMilesDriven / numGallonsConsumed;
        System.out.println("Currently running on " + mpg + " mpg.");
    }
}
