package day17_WhileDoWhile;

import java.util.Scanner;

public class Proposal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Will you marry me? Yes/No");

        String answer = scan.next().toLowerCase();// ingore the word sensitivite so use lowercase operator


        while(!(answer.equals ("Yes") ||(answer.equals("No")))){

            System.err.println("Invalid answer, please re-enter");
            answer = scan.next().toLowerCase();

        }
        if(answer.equals(("yes"))){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }
        System.out.println(answer);
    }







}
/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer,
    please re-enter" and repeat it until the user enters either yes or no
 */