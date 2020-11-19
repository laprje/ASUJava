/*-------------------------------------------------------------
//AUTHOR: Lansing Jenkins
//FILENAME: Student.java
//SPECIFICATION: Student.java file for Lab7; student class
//FOR: CSE110 Lab 7
//-----------------------------------------------------------*/

import java.time.LocalDateTime;

public class Student {
    private String firstName, lastName, fullName, asuId;
    private double grade;

    public Student(String firstName, String lastName, String asuId, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.asuId = asuId;
        this.grade = grade;
    }

    public String toString() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return fullName;
    }
    public String getAsuID() {
        return asuId;
    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double newGrade) {

    }
}
