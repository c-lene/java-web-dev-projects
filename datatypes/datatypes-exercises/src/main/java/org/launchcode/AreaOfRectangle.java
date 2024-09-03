package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle: ");
        int numLength = input.nextInt();

        System.out.println("Enter the Width of the Rectangle: ");
        int numWidth = input.nextInt();

        int numAreaRectangle = numLength * numWidth;
        System.out.println("The Area of the Rectangle is " + numAreaRectangle + ".");
    }
}
