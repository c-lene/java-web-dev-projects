package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentID;
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        //Get student id  and names
        do {

            System.out.print("Student Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                newStudentID = input.nextInt();
                students.put(newStudentID, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print Class Roster
        System.out.println("\nClass Roster:");

        // Uses For-Each loops - For each interator "student" in "students" HashMap
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("\nStudent ID: " + student.getKey());
            System.out.println("Student Name : " + student.getValue());
        }
    }
}
