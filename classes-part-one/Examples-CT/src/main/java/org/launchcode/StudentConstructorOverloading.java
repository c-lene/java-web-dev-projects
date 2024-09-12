package org.launchcode;

public class StudentConstructorOverloading {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    // Using Multiple Constructors - Method 1

    // Useful for creating Transfer Students with pre-exisiting credits & gpa (Non-Zero)
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    // Useful for creating New Students - Initializes credits & gpa to 0
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }


}
