package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        /*

         letters[0] = 'A';
         letters[1] = 'B';

         */

        System.out.println(Arrays.toString(letters));//[A to Z]

        /* for (char i ='A',j = 0; i <='Z' && j <= letters.length; i++,j++) {//j: index numbers0 to last index 25
                                                                           // i:character char
                                                                           // every single char has number
            letters[j]=(char)i;
            
        */

        // Outside the loop, define (`char ch;`) and
        // initialize (first-time assignment) (`ch = 'A';`) the variable `ch`.
        char ch = 'A';

        for (int i = 0; i < letters.length; i++) {  // `i` is index number 0 to last index.
            letters[i] = ch++;       // we can assign `ch` at the initialization part outside `for` loop.
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        char[] letters2 = new char[26];//Z to A
        char ch2 = 'A';

        for (int i = letters2.length - 1; i >= 0; i--) {
            letters2[i] = ch2++;
        }

/*
        ch2 = 'Z';
        for (int i = 0; i < letters2.length; i++) {
            letters2[i] = (char) (ch2 - i);
        }
*/

        System.out.println(Arrays.toString(letters2));
    }
}

