package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you want to enter?");

        int length = scan.nextInt();//10

        if (length <= 0){
            System.out.println("invalid Entry");
            System.exit(0); // it exterminated the program
        }

        int[]numbers = new int[length]; //array needs to have enough capacity

        for (int i = 0; i < length; i++) {// last index number always less than length;

            System.out.println("Enter a number");
            numbers[i]= scan.nextInt();//each input user provided during each execution of the loop,
                                    // will be assigned to the indexes of the array;

        }

        System.out.println(Arrays.toString(numbers));

        scan.close();



    }
}
