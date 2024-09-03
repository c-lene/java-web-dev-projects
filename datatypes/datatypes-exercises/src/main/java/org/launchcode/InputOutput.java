package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your favorite number?");
        int numFav = input.nextInt();

        System.out.println(name + "'s favorite number is " + numFav);
    }
}
