package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        double radius = input.nextFloat();

//        double areaOfCircle = (3.14 * radius * radius);
        double areaOfCircle = Circle.getArea(radius);

        System.out.println("The Area of a Circle of Radius " + radius + " is : " + areaOfCircle);
    }
}
