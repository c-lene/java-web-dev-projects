package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacterBonusMission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String for Character Count: ");
        String userString = input.nextLine();

        String alphabetLowercase = "abcdefghijklmnopqrstuvwxyz";


        // Makes user input Case-Insensitive
        char[] charactersInString = userString.toLowerCase().toCharArray();


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
