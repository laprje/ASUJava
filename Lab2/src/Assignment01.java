// CSE 110     : Fall B Session
// Assignment  : Lab 2
// Author      : Lansing Jenkins
// Description : Lab 2 for Variables (Pizza Slice Problem)

// NOTES:
//Each adult will get two slices of pizza
//Remaining slices will be divided evenly among the children
//Each child will get the same number of slices of pizza
//No pizza slices will be split or divided

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner userInput = new Scanner(System.in);

        // declare and initialize variables for inputs
        int pizzas;
        int slicesPer;
        int adults;
        int children;

        // declare and initialize variables for outputs
        int totalSlices;
        int slicesToAdults;
        int slicesToChildren;
        int slicesToEachChild;
        int slicesLeft;

        // prompt for and collect inputs
        System.out.println("How many pizzas did you buy?");
        pizzas = userInput.nextInt();
        System.out.println("How many slices are in each pizza?");
        slicesPer = userInput.nextInt();
        System.out.println("How many Adults are at the party?");
        adults = userInput.nextInt();
        System.out.println("How many children are at the party?");
        children = userInput.nextInt();

        // compute required values
        totalSlices = pizzas * slicesPer;
        slicesToAdults = adults * 2;
        slicesToChildren = (totalSlices - slicesToAdults);
        slicesToEachChild = (slicesToChildren/children);
        slicesLeft = (slicesToChildren%children);

        // display required outputs
        System.out.println("Total Slices: " + totalSlices);
        System.out.println("Number of Slices Given to Adults: " + slicesToAdults);
        System.out.println("Number of Slices Available for Children: " + slicesToChildren);
        System.out.println("Number of Slices given to Each Child: " + slicesToEachChild);
        System.out.println("Number of Slices Left: " + slicesLeft);
    }
}
