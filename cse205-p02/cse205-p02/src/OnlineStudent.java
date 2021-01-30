/*********************************************************************************************************
 * CLASS: OnlineStudent (OnlineStudent.java)
 *
 * DESCRIPTION
 * OnCampusStudent class to represent students that live off-campus for Project 2.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring A 2021
 *  Project Number: 2
 *
 * GROUP INFORMATION
 * AUTHOR 1: Charles Cipolla, ccipolla, ccipolla@asu.edu
 * AUTHOR 2: Lansing Jenkins, ljenki14, ljenki14@asu.edu
 * AUTHOR 3: Gregory Ingraham, gingrah1, gingrah1@asu.edu ********************************************************************************************************/

public class OnlineStudent extends Student{

    private boolean mTechFee;

    public OnlineStudent(String pFirstName, String pLastName, String pId) {
        super(pFirstName, pLastName, pId);
    }

    /**
     * Overrides the calcTuition() method set in the Student class, and calculates the tuition for an online student based upon tuition and the Online Credit Rate.
     */
    @Override
    public void calcTuition() {
        double t = super.getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
        t = getTechFee() == true ? (t + TuitionConstants.ONLINE_CREDIT_RATE) : t;
        super.setTuition(t);
    }
    /**
     * returns mTechFee (true or false)
     */
    public boolean getTechFee() {
        return mTechFee;
    }
}

