public class Teacher {

    // FIELDS
    String firstName;
    String lastName;
    String subject;
    double yearsTeaching;




    // CONSTRUCTORS
    public Teacher(String firstName, String lastName, String subject, double yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }




    // Getters & Setters - String getFirstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    // Getters & Setters - String getLastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    // Getters & Setters - String getSubject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    // Getters & Setters - double getYearsTeaching
    public double getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(double yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }


    // METHODS
    String getInstructorInfo() {
        return firstName + lastName + " teaches " + subject + " for " + yearsTeaching + " years.";
    }
}
