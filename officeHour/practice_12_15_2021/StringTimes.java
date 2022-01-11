package practice_12_15_2021;

import java.util.Scanner;

public class StringTimes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word.");
        String word= input.nextLine();
        System.out.println("Enter any positive number: ");
        int num = input.nextInt();

        int count = 0;
        String sum = "";

        while (count <num){ // ?
            sum= sum + word;
            count++;
        }
        System.out.println(sum);

       /* for (int i = 0; i < num; i++) {
            sum += word;
        }
        System.out.println(sum);*/



    }
}
 /*
          (StringTimes)
        Given a string and a non-negative int n, return a larger string that is n copies of the original string.

       input String : Hi  ,  input int : 3

        output: HiHiHi
                  */