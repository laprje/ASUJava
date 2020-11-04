// CSE 110     : CSE 110 Online
// Assignment  : Assignment 3
// Author      : Lansing Jenkins
// Description : stock trade decision making program

import java.util.Scanner;

public class Assignment03 {

    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
        int currentShares = 0;
        double purchasePrice = 0.0;
        double marketPrice = 0.0;
        double availableFunds = 0.0;

        // prompt for and collect inputs
        System.out.println("Current shares:");
        currentShares = in.nextInt();

        System.out.println("Purchase Price:");
        purchasePrice = in.nextDouble();

        System.out.println("Market Price:");
        marketPrice = in.nextDouble();

        System.out.println("Available Funds:");
        availableFunds = in.nextDouble();

        // compute required values
        int sharesToBuy = (int) Math.floor((availableFunds-10)/marketPrice);
        double totalBuyCost = 10 + (marketPrice * sharesToBuy);
        double perShareBuyValue = purchasePrice - marketPrice;
        double totalBuyValue = (perShareBuyValue * sharesToBuy);
        double perShareSellValue = marketPrice - purchasePrice;
        double totalSellValue = (perShareSellValue * currentShares);

        // display required outputs

        if(marketPrice<purchasePrice && sharesToBuy>0) {
            System.out.println("Buy " + sharesToBuy + " shares.");
        } else if(marketPrice>purchasePrice && (perShareSellValue*currentShares)>10) {
            System.out.println("Sell " + currentShares + " shares.");
        } else {
            System.out.println("Hold shares.");
        }

    }
}
