
/*-------------------------------------------------------------
// AUTHOR: Teaching Assistant in CSE110
// FILENAME: AutoGrader.java
// SPECIFICATION: This is your test driver for Lab7. Please do
// NOT touch anything in this file.
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sFirstname, sLastname, sAsuID;
        double sGrade;
        String pName, pDesc, pFname;

        // Read some input data
        println("The student's first name?");
        sFirstname = scan.nextLine();
        println("The student's last name?");
        sLastname = scan.nextLine();
        println("The student's ASU ID?");
        sAsuID = scan.nextLine();
        println("Program name?");
        pName = scan.nextLine();
        println("Program desc?");
        pDesc = scan.nextLine();
        println("Program filename?");
        pFname = scan.nextLine();
        println("Program grade?");
        sGrade = scan.nextDouble(); //scan.nextLine();
        println(""); scan.close();

        // Create a Student object "student1"
        Student student1 = new Student(sFirstname, sLastname, sAsuID, sGrade);             //ADD PARAMS
        // Use the setGrade setter to set student1's grade


        // Create a Program object "program1" by "student1"
        Program program1 = new Program(pName, pDesc, pFname, student1);
        System.out.println("Making a program record\n...[" + program1 + "]");

        // Invoke makeReport to show the report of student1
        makeReport(program1);
    }



    private static void makeReport(Program program) {
        println("\n========== Program Submission Detail ==========");
        pprint("Student", program.getAuthor().getFullName());
        pprint("ASU ID", program.getAuthor().getAsuID());
        pprint("Grade", "" + program.getAuthor().getGrade());
        println("");
        pprint("Program", program.getProgramName());
        pprint("Filename", program.getFileName());
        pprint("Description", program.getDescription());
        pprint("Datetime", program.getCreatedDate());
    }

    private static void pprint(String key, String value) {
        println(String.format("%-12s: %-10s", key, value));
    }

    private static void println(String s) {
        System.out.println(s);
    }
}
