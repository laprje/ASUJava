/*-------------------------------------------------------------
//AUTHOR: Lansing Jenkins
//FILENAME: Student.java
//SPECIFICATION: Student.java file for Lab7; student class
//FOR: CSE110 Lab 7
//-----------------------------------------------------------*/


public class Student {
    private String fullName, asuId;
    private double grade;
    int numUpdates, numAccessed;

    public Student(String name, String asuId, double grade) {
        this.fullName = name;
        this.asuId = asuId;
        this.grade = grade;
        this.numUpdates = 0;
        this.numAccessed = 0;
    }

    public String toString() {
        return "[Name: " + this.fullName + ", ASUID: " + this.asuId + ", Grade: " + this.grade + "]";
    }

    public Student() {
        this.fullName = "";
        this.asuId = "";
        this.grade = -1.0;
    }

    public String getFullname() {
        this.numAccessed += 1;
        return fullName;
    }
    public String getAsuID() {
        this.numAccessed += 1;
        return asuId;
    }
    public double getGrade() {
        this.numAccessed += 1;
        return grade;
    }

    public void setGrade(double newGrade) {
        this.numUpdates += 1;
        this.grade = newGrade;
    }

    public void setId(String newId) {
        this.numUpdates += 1;
        this.asuId = newId;
    }

    public void setName(String newName) {
        this.numUpdates += 1;
        this.fullName = newName;
    }

    public int getNumOfUpdates() {
        numAccessed += 1;
        return this.numUpdates;
    }

    public int getNumOfAccessed() {
        numAccessed += 1;
        return this.numAccessed;
    }

    public boolean equals(Student other) {
        numAccessed += 1;
        if(this.asuId == other.asuId) {
            return true;
        } else if(this.fullName.equalsIgnoreCase(other.fullName)) {
            return true;
        }
        return false;
    }
}
