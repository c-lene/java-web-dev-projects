package org.launchcode;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int credits) {
        // Determine the grade level of the student based on numberOfCredits
        if (credits <= 29 && credits > 0) {
            return "Freshman";

        } else if (credits >= 30 && credits <= 59) {
            return "Sophomore";

        } else if (credits >= 60 && credits <= 89) {
            return "Junior";

        } else if (credits >= 90) {
            return "Senior";

        } else {
            return "\nInvalid input. Number of Credits must be a POSITIVE number!\n";
        }

    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        // Calculates current Total Quality Score
        double totalQualityScore = this.gpa * this.numberOfCredits;

        // Using New Course grade & Course credits to update Total Quality Score
        totalQualityScore += courseCredits * grade;

        // Updates the student's total numberOfCredits
        this.numberOfCredits += courseCredits;

        // Calculates new GPA
        this.gpa = totalQualityScore / this.numberOfCredits;




    }

    // TODO: Add your custom 'toString' method here.
    // Make sure it returns a well-formatted String rather than just the class fields.

    @Override
    public String toString() {

        // Rounds the GPA to 1 decimal place
        double roundedGPA = Math.round(gpa * 10.0) / 10.0;

        return "\nStudent Name: " + name +
                "\nStudent ID: " + studentId +
                "\nGrade Level: " + getGradeLevel(numberOfCredits) +
                "\nNumber of Credits: " + numberOfCredits +
                "\nGPA: " + roundedGPA + "\n";
    }


    // TODO: Add your custom 'equals' method here.
    // Consider which fields should match in order to call two Student objects equal.

    @Override
    public boolean equals(Object toBeCompared) {

        // Reference check
        if (this == toBeCompared) {
            return true;
        }

        // Null check
        if (toBeCompared == null) {
            return false;
        }

        // Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        // Casting
        Student theStudent = (Student) toBeCompared;

        // Returns TRUE if studentId match in order to call two Student objects equal.
        return theStudent.getStudentId() == getStudentId();
    }



    /**** GETTERS & SETTERS ****/
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}