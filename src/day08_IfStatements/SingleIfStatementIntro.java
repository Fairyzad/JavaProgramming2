package day08_IfStatements;

import org.w3c.dom.ls.LSOutput;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 101;//even number should ve evenly divided by 2.

        boolean evenNumber = number%2 ==0;
        boolean oddNumber =! evenNumber;

        if(evenNumber) { //false
            System.out.println(number + " is even number");
        }

        if (oddNumber)//! means not, not even number,true {
            System.out.println(number + " is odd number");

        System.out.println("------------------------------");

        int n= 200;

        // positive
        if (n>0) //if the n is greater than zero, then it is a positive number {
            System.out.println(n + " is positive");
        }

        //negative


    }


