package org.launchcode;

import java.util.Scanner;

public class AliceAdventuresInWonderland {
    public static void main(String[] args) {
        String firstSentence =
                "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";


        // Prints out the firstSentence
        System.out.println(firstSentence);


        // Declare & Initialize 'input' variable
        Scanner input = new Scanner(System.in);


        // Ask user to input search term and initialize & declare variable
        System.out.println("What term would you like to search for within the first sentence of 'Alice's Adventures in Wonderland'?");

        // Declare & Initialize 'searchTerm' as a String ITEM
        String searchTerm = input.next();


        // Ensures user input is Case-Insensitive
        String firstSentenceLowercase = firstSentence.toLowerCase();
        String searchTermLowercase = searchTerm.toLowerCase();


        // Uses If/Else statement to search for 'searchTerm' & prints "true" / "false"
        if (firstSentenceLowercase.contains(searchTermLowercase)) {
            System.out.println("true");

            // Declares & Initialize the Index of 'searchTerm'
            int searchTermIndex = firstSentenceLowercase.indexOf(searchTermLowercase);

            // Declares & Initialize the Length of 'searchTerm'
            int searchTermLength = searchTermLowercase.length();

            // Prints out Index & Length of 'searchTerm'
            System.out.println("The entered search term initially appears at Index " + searchTermIndex + " and is " + searchTermLength + " characters long!");


            // Modifying firstSentence to remove the 'searchTerm'
            int endIndex = searchTermIndex + searchTermLength;
            int statementEndIndex = firstSentence.length();

            String modifiedStart = firstSentence.substring(0, searchTermIndex);
            String modifiedEnd = firstSentence.substring(endIndex, statementEndIndex-1);

            String modifiedStatement = modifiedStart + modifiedEnd;
            System.out.println(modifiedStatement);

        } else {
            System.out.println("false");
        }
    }
}
