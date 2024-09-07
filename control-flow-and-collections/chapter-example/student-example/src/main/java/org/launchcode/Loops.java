package org.launchcode;

public class Loops {
    public static void main(String[] args) {

        // For Loop Examples - Using i++ increment operator
        System.out.println("~~~~~ For Loop Examples ~~~~~~");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // For Loop Examples - Using i-- increment operator
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }



        // For-Each Loop Examples
        System.out.println("~~~~~~ For-Each Loop Examples ~~~~~~");

        // For-Each Loop - iterates over any sequence/collection -such as Array
        int nums[] = {1, 1, 2, 3,5, 8, 13, 21};

        for (int i : nums) {
            System.out.println(i);
        }

        // For-Each Loop - converts String to an Array of characters
        String msg = "Hello World";

        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }


        // Do-While Loop examples
        System.out.println("~~~~~~ Do-While Loop Examples ~~~~~~");

        do {
            System.out.println("Hello, World");
        } while (false);

    }
}
