// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

import java.util.Scanner;

public class Assignment02 {

    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize variables (input)
        double miles = 0.0;
        int lanes = 0;
        int depth = 0;
        int days = 0;

        // declare and initialize variables (output)
        int truckloads = 0;
        int stoplights = 0;
        int conduit = 0;  //220*miles
        int crewmembers = 0;
        //cost
        double c_Asphalt = 0.0;
        double c_Stoplight = 0.0;
        double c_Conduit = 0.0;
        double c_Labor = 0.0;
        double totalCost = 0.0;

        // collect inputs
        System.out.println("How long is the road? (miles)");
        miles = in.nextDouble();
        System.out.println("How many lanes are there?");
        lanes = in.nextInt();
        System.out.println("How deep does the asphalt go? (inches)");
        depth = in.nextInt();
        System.out.println("How many days do you have to complete the project?");
        days = in.nextInt();

        // compute required values
        stoplights = (int)(Math.floor(miles))*lanes;
        crewmembers = (int)Math.floor((50*miles*lanes)/days);
        c_Labor = 8.0 * 25.0 * crewmembers * days;
        conduit = (int)(220*miles);
        c_Conduit = conduit*500;
        c_Stoplight = stoplights * 25000;
        truckloads = (int)Math.ceil(((miles*5280)*(depth/12.0)*(lanes*12.0)*150.0)/10000.00);
        c_Asphalt = truckloads * 5 * 200;
        totalCost = c_Asphalt + c_Conduit + c_Labor + c_Stoplight;

        // display results
        System.out.println("=== Amount of materials needed ===");
        System.out.println("Truckloads of asphalt: " + truckloads);
        System.out.println("Stoplights: " +stoplights);
        System.out.println("Conduit pipes: " + conduit);
        System.out.println("Crew members needed: " + crewmembers);
        System.out.println("=== Cost of Materials ============");
        System.out.println("Cost of asphalt: $"+c_Asphalt);
        System.out.println("Cost of stoplights: $" +c_Stoplight);
        System.out.println("Cost of conduit pipes: $"+c_Conduit);
        System.out.println("Cost of Labor: $"+c_Labor);
        System.out.println("=== Total cost of project ===");
        System.out.println("Total: $" + totalCost);

    }

}
