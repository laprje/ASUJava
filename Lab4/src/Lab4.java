/*------------------------------------------------------------
// AUTHOR: lansing jenkins
// FILENAME: lab4
// SPECIFICATION:
// FOR: CSE 110- Lab #4
// TIME SPENT: 35 min
---------------------------------------*/

import java.util.Scanner;

public class Lab4 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);


        int n = 0;
        while(n<4) {



            System.out.println("Please choose one option from the following menu:");
            System.out.println("1) Calculate the sum of integers from 1 to m");
            System.out.println("2) Calculate the factorial of a given number");
            System.out.println("3) Display the leftmost digit of a given number");
            System.out.println("4) Quit");

            n = in.nextInt();

            switch (n) {
                case 1:
                    long sum = 0;
                    System.out.println("Enter a number:");
                    int input = in.nextInt();
                    for(int i = 1; i <= input; i++) {
                        sum = sum + i;
                    }
                    System.out.println("The sum of all integers from 1 to " + input + " is " + sum);
                    break;
                case 2:
                    long product = 1;
                    System.out.println("Enter a number:");
                    int input2 = in.nextInt();
                    for(int i2 = 1; i2 <= input2; i2++) {
                        product = product * i2;
                    }
                    System.out.println("The factorial of " + input2 + " is " + product);
                    break;
                case 3:
                    System.out.println("Enter a number:");
                    long input3 = in.nextLong();
                    String first = Long.toString(input3).substring(0,1);
                    System.out.println("The leftmost digit of " + input3 + " is " + first);
                    break;
                case 4:
                    System.out.println("Goodbye.");
                    return;
            }
        }


    }
}
