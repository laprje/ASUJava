/*-------------------------------------------------------------
// AUTHOR: Lansing Jenkins
// FILENAME: Lab2.java
// SPECIFICATION: Taking 2 string inputs and adding them together, along with counting the characters within each substring.
// FOR: CSE 110 - Lab #2
// TIME SPENT: ~20 min
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab2 {
    public static void main (String[] args) {
        //variables
        String first;
        String last;
        String full;
        String full2;
        int length;
        boolean doubleEquals;
        boolean equals;
        Scanner scan = new Scanner(System.in);

        //logic & output
        System.out.println("Type your first name: ");
        first = scan.next();
        System.out.println("Type your last name: ");
        last = scan.next();
        full = (first + " " + last);
        System.out.println(full.toUpperCase());
        length = full.length();
        System.out.println(length);
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        if (str1 == str2) {
            System.out.println("'==' operator works with strings");
        } else {
            System.out.println("'==' operator does not work with strings");
        }
        if (str1.equals(str2)){
            System.out.println("Equals method works with strings");
        } else {
            System.out.println("Equals method does not work with strings");
        }
    }
}
