package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradebook {
    public static void main(String[] args) {

        // Declaring a HashMap 'students' with a String = key, Double = value
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = input.nextDouble();

                // Using put() method to specify both key & value
                students.put(newStudent, newGrade);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        // In the For-Each Loop - Uses Map.Entry to represent key/value pairs within HashMaps
        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
