package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String [] args) {

        // Using For-Each Loop to iterate each element in Array to print out odd numbers
        System.out.println("~~~~~ Prints only Odd Numbers from Array ~~~~~");
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int numInts : integerArray) {
            if (!(numInts % 2 == 0)) {
                System.out.println(numInts);
            }
        }


        // Uses split() method to split 'phrase' string
        System.out.println("");
        System.out.println("~~~~~ Splits a String ~~~~~");

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        System.out.println(phrase);

        // Splits String 'phrase' at delimiter " " and storing individual words in an Array
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        // Splits String 'phrase' at delimiter "." and storing individual sentences in an Array
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
