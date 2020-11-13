/*-------------------------------------------------------------
// AUTHOR: Lansing Jenkins
// FILENAME: Lab6.java
// SPECIFICATION: Taking user inputs and putting them into arrays using a for loop, then accessing them using another loop.
// FOR: CSE 110- Lab #6
// TIME SPENT: 20 min
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = -1;
//        int numGroups = -1;  // Part 2

        //ask for number of students
        System.out.println("How many students?");

        //initalize the array based on user input
        numStudents = scanner.nextInt();
        int[] studentGroups = new int[numStudents];
        double[] studentGrades = new double[numStudents];

        //complete the code here for part 1
        for(int i=0; i<numStudents; i++) {
            System.out.println("[Group #] for Entry " + (i+1));
            studentGroups[i] = scanner.nextInt();
            System.out.println("[Grade] for Entry " + (i+1));
            studentGrades[i] = scanner.nextDouble();
        }

        System.out.println("==== List of Student Records =====");
        for(int i=0; i<numStudents; i++) {
            System.out.println("Group " + studentGroups[i] + " - " + studentGrades[i] + " points");
        }

//        // Part 2: Find the number of groups
//        if (studentGroups[i] > numGroups)  {
//            numGroups = studentGroups[i];
//        }


        // Print out the records
        // The code below is only for Part 2

//    double[] groupAverages = new double[numGroups + 1];  // Avoid group 0
//    int[] groupSizes = new int[numGroups + 1];  // Avoid group 0

        // For each student record,
        //   - find the group # and the grade, and
        //   - update groupAverages and groupSizes


        // Display the statistics of groups


        scanner.close();
    }
}

