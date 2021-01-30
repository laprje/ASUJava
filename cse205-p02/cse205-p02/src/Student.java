/*********************************************************************************************************
 * CLASS: Student (Student.java)
 *
 * DESCRIPTION
 * A description of the contents of this file.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring A 2021
 *  Project Number: 2
 *
 * GROUP INFORMATION
 * AUTHOR 1: Charles Cipolla, ccipolla, ccipolla@asu.edu
 * AUTHOR 2: Lansing Jenkins, ljenki14, ljenki14@asu.edu
 * AUTHOR 3: Gregory Ingraham, gingrah1, gingrah1@asu.edu ********************************************************************************************************/


//**************************************************************************************************
// CLASS: Student
//
// DESCRIPTION
// Student is an abstract class and is the superclass for the OnCampusStudent and OnlineStudent
// classes. Remember that in a class hierarchy, the superclass declares data and methods that are
// common to all types of students.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
//**************************************************************************************************
public abstract class Student implements Comparable<Student> {

    private String mFirstName, mLastName, mId;
    private int mCredits;
    private double mTuition;
    

    /**
     * Creates a Student object and initializes the mId, mFirstName, and mLastName instance
     * variables.
     */
    
    public Student(String pFirstName, String pLastName, String pId) {
    	mFirstName = pFirstName;
    	mLastName = pLastName;
    	mId = pId;
    }

    /**
     * calcTuition() is to be implemented by subclasses of Student. Remember that abstract methods
     * are not implemented in a superclass but must either be implemented in a subclass, or if not,
     * then the subclass also becomes an abstract class. The reason calcTuition() is abstract
     * and intended to be implemented by the subclasses of Student is because how we calculate the
     * tuition for an OnCampusStudent is different than how we calculate the tuition for an Online-
     * Student.
     */

    public void calcTuition() {
    	
    }
    

    /**
     * The java.lang.Comparable<T> interface declares one method int compareTo(T obj) that must be
     * implemented by any class which implements the interface. This method is called from Sorter.
     * keepMoving() to compare the mId fields of two Students.
     *
     * Compares the mId fields of 'this' Student and pStudent. Returns -1 if this Student's mId
     * field is less than pStudent's mId field. Returns 0 if this Student's mId field is equal to
     * pStudent's mId field. Returns 1 if this Student's mId field is greater than pStudent's mId
     * field.
     *
     * Note that the mId field of a Student is a java.lang.String and String also implements the
     * Comparable<String> interface and consequently, also implements a compareTo() method to
     * compare two strings. Hence, all we have to do here is to call the String class compareTo()
     * method on the two mId strings of 'this' Student and pStudent and return whatever that method
     * returns.
     */
    @Override
    public int compareTo(Student pStudent) {
        return getId().compareTo(pStudent.getId());
    }

    /**
     * Accessor method for mCredits.
     */
    public int getCredits() {
    	return mCredits;
    }

    /**
     * Accessor method for mFirstName.
     */
    public String getFirstName() {
    	return mFirstName;
    }
    

    /**
     * Accessor method for mId.
     */
    public String getId() {
    	return mId;
    }
    

    /**
     * Accessor method for mLastName.
     */
    public String getLastName() {
    	return mLastName;
    }
    

    /**
     * Accessor method for mTuition.
     */
    public double getTuition() {
    	return mTuition;
    }
    

    /**
     * Mutator method for mCredits.
     */
    public void setCredits(int pCredits) {
    	mCredits = pCredits;
    }
    

    /**
     * Mutator method for mFirstName.
     */
    public void setFirstName(String pFirstName) {
    	mFirstName = pFirstName;
    }
    

    /**
     * Mutator method for mId.
     */
    public void setId(String pId) {
    	mId = pId;
    }
    

    /**
     * Mutator method for mLastName.
     */
    public void setLastName(String pLastName) {
    	mLastName = pLastName;
    }
    

    /**
     * Mutator method for mTuition.
     */
    protected void setTuition(double pTuition) {
    	mTuition = pTuition;
    }
    

}
