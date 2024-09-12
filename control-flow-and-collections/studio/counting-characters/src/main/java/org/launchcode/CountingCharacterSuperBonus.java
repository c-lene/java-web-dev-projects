package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacterSuperBonus {
    public static void main(String[] args) {

        // Declared & Initialized a variable to hold the quote
        String importedQuote = "";

        // Uses Try-Catch to throw an Error if unable to read file
        try {
            File textFromFile = new File("src/main/java/org/launchcode/quote.txt");
            Scanner scanText = new Scanner(textFromFile);

            if (scanText.hasNextLine()) {
                importedQuote = scanText.nextLine();
            }

            scanText.close();

        } catch (FileNotFoundException e) {
            System.out.println("An Error occured when trying to read quote from file.");
        }


        String alphabetLowercase = "abcdefghijklmnopqrstuvwxyz";


        // Makes user input Case-Insensitive
        char[] charactersInString = importedQuote.toLowerCase().toCharArray();

        // Prints out the converted text from file
        System.out.println(charactersInString);


        // Declaring HashMap 'charCount' with a String = Key, Integer = Value
        HashMap<Character, Integer> charCount = new HashMap<>();

        // For each char 'letter' in 'charactersInString' array
        for (char letter : charactersInString) {


            // Using IF statement to EXCLUDE Non-alphabetic Characters
            if (alphabetLowercase.indexOf(letter) >= 0) {

                // Using If-Else Statement - IF 'charCount' HashMap contains a Key = 'letter'
                if (charCount.containsKey(letter)) {

                    // Using put() method to specify both Key & Value
                    charCount.put(letter, charCount.get(letter) + 1);

                } else {

                    // IF 'charCount' HashMap does NOT contain a Key = 'letter' - THEN set value to 1
                    charCount.put(letter, 1);
                }
            }
        }

        // Using Map.Entry in a For-Each Loop to print out Key/Value pairs within the HashMap
        for (Map.Entry<Character, Integer> numLetterCount : charCount.entrySet()) {
            System.out.println(numLetterCount.getKey() + " : " + numLetterCount.getValue());
        }

    }
}
