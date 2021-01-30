/*********************************************************************************************************
 * CLASS: OnCampusStudent (OnCampusStudent.java)
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

public class OnCampusStudent extends Student{
	
	private int mResident;
	private double mProgramFee;
	public final int RESIDENT = 1;
	public final int NON_RESIDENT = 2;
	
	public OnCampusStudent(String pFirstName, String pLastName, String pId) {
		super(pFirstName, pLastName, pId);
	}

	/**
	 * Overrides the calcTuition() method set in the Student class; calculates the tuition of an On-Campus Student based upon residency and tuition rates.
	 */
	@Override 
	public void calcTuition() {
		double t;
		if (getResidency() == 1) {
			t = TuitionConstants.ONCAMP_RES_BASE;
		}
        else
        	t = TuitionConstants.ONCAMP_NONRES_BASE;
		
		t = t + getProgramFee();
		if (super.getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
			t = t + (super.getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
		}
    super.setTuition(t);
	}
	/**
	 * Accessor and Mutator methods for each instance variable.
	 */
	public double getProgramFee() {
		return mProgramFee;
	}
	
	public int getResidency() {
		return mResident;
	}
	
	public void setProgramFee(double pProgramFee) {
		mProgramFee = pProgramFee;
	}
	
	public void setResidency(int pResident) {
		mResident = pResident;
	}

}
