package practice_12_01_2021;

import day11_Switch_Scanner.ScannerIntro;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your quantity");
        int quantity = scan.nextInt();

        double unitPrice = 100;
        double totalCost = quantity *unitPrice;
        double discountRate= 0.1;
        double totalDiscount;

        if(totalCost >= 1000){
            totalDiscount = discountRate * totalCost;

        }

        }

    }

/*
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
                            Create a quantity variable
                            Suppose, one unit will cost 100.
                            Judge and print total cost for user.
                            ( Scanner Class can be used )

                            INPUT for quantity :  5    EXPECTED : No discount applied

                            INPUT for quantiy  :  15  EXPECTED : You get a discount of $discount and
                            your total cost is $totalCost
 */