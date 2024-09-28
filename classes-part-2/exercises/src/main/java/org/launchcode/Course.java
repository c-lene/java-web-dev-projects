package org.launchcode;

import java.util.ArrayList;

public class Course {

    /**** FIELDS ****/

    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;


    /**** CONSTRUCTORS ****/
    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }




    /**** GETTERS & SETTERS ****/

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }






    // TODO: Add your custom 'toString' method here.
    // Make sure it returns a well-formatted String rather than just the class fields.

    @Override
    public String toString() {

        // Builds a list of enrolled students
        StringBuilder studentRoster = new StringBuilder();

        // Using For-Each Loop to iterate through 'enrolledStudents' ArrayList to add each student to 'studentRoster' StringBuilder
        for (Student student : enrolledStudents) {
            studentRoster.append(student.toString());
        }

        // Overrided new output
        return "\n" + topic + " is instructed by " + instructor +
                "\n" + "Student Roster: " +
                "\n\t" + studentRoster;
    }


    // TODO: Add your custom 'equals' method here.
    // Consider which fields should match in order to call two Course objects equal.


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
        Course theCourse = (Course) toBeCompared;


        // Returns TRUE if 'topic' match in order to call two Course objects equal.
        return theCourse.getTopic() == getTopic();
    }
}
