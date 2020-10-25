/*-------------------------------------------------------------
// AUTHOR: Lansing Jenkins
// FILENAME: Lab3.java
// SPECIFICATION: taking user input, calculate the overall grades of a student and determine whether or not they passed
// FOR: CSE 110- Lab #3
// TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        //vars
        Scanner in = new Scanner(System.in);
        double hw = 0;
        double midterm = 0;
        double finalExam = 0;
        int i = 0;
        double totalGrade = 0;

        while(i<3) {
            if(i == 0){
                System.out.println("What is your HW grade?");
                hw = in.nextDouble();
                while(hw>100||hw<0){
                    hw = 0;
                    System.out.println("Re-enter HW grade. Must be less than or equal to 100 and above 0.");
                    hw = in.nextDouble();
                }
                i++;
            } else if(i==1){
                System.out.println("What's your midterm grade?");
                midterm = in.nextDouble();
                while(midterm>100||midterm<0){
                    midterm = 0;
                    System.out.println("Re-enter midterm grade. Must be less than or equal to 100 and above 0.");
                    midterm = in.nextDouble();
                }
                i++;
            } else if(i==2){
                System.out.println("What's your final exam grade?");
                finalExam = in.nextDouble();
                while(finalExam>200||finalExam<0){
                    midterm = 0;
                    System.out.println("Re-enter midterm grade. Must be less than or equal to 200 and above 0.");
                    finalExam = in.nextDouble();
                }
                i++;
            }
        }

        totalGrade = (((finalExam/200)*50) + (midterm*.25) + (hw*.25));
        if(totalGrade>=50) {
            System.out.println("You passed the class!");
            System.out.println("Final Grade:" + totalGrade);
        } else {
            System.out.println("You failed....");
            System.out.println("Final Grade:" + totalGrade);
        }

    }
}
