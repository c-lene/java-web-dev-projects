package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        // ArrayList Practice #1 - Calls sumEven method to sum up all even numbers in an ArrayList
        System.out.println("~~~~~~ ArrayList Practice #1 ~~~~~~");

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);

        System.out.println(sumEven(intList));


        // ArrayList Practice #2
        System.out.println("");
        System.out.println("~~~~~~ ArrayList Practice #2 ~~~~~~");

        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("a");
        wordList.add("ab");
        wordList.add("abc");
        wordList.add("abcd");
        wordList.add("abcde");
        wordList.add("abcdef");
        wordList.add("abcdefg");
        wordList.add("abcdefgh");
        wordList.add("abcdefghi");
        wordList.add("abcdefghij");

        wordDisplay(wordList);


        // BONUS - Converts String to ArrayList
        System.out.println("");
        System.out.println("~~~~~~ ArrayList Practice #2 - BONUS Mission ~~~~~~");
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        System.out.println(convertStringToArrayList(phrase));


    }


    // Static Method to find the SUM of all EVEN numbers in an ArrayList
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;

        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }


    // Static Method to print out each word in a list that has exactly 5 letters
    public static void wordDisplay(ArrayList<String> wordArray) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word length:");
        int numChars = input.nextInt();
//        int numLetter = 5;

        for (String wordLetter : wordArray) {
            if (wordLetter.length() == numChars) {
                System.out.println(wordLetter);
            }
        }
    }


    public static ArrayList<String> convertStringToArrayList(String phrase) {

        // Splits the string by the delimiter
        String[] phraseArray = phrase.split("\\.");

        ArrayList<String> phraseList = new ArrayList<>(Arrays.asList(phraseArray));
        return phraseList;
    }

}
