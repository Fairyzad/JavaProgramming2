package day21_ForeEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int []numbers = {10,20,30,40};
        // index        0 1 2 3 4

        // {50,40,30,20,10}

        int []reversed = new int[numbers.length]; // to makesure that array has enough capacity
                                                 // to contain all the elements of first array
        /*       j             i
        reversed[0] = numbers[3];
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];

         */
        for (int i = numbers.length-1; i < 0 ; i++) {

        }
        System.out.println(Arrays.toString(reversed));

    }

}
