package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

       char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }

        System.out.println(Arrays.toString(letters));  // toString(arrays): converts array to string


        System.out.println("-------------------------------");

        char[] letters2 = new char[26];  //[Z~A] 'Z' is 90 in AsciiTable

        char ch2 = 'A';

        for (int i = letters2.length-1; i >=0 ; i--) {

            letters2[i] = ch2;
            ch2++;

        }
        System.out.println(Arrays.toString(letters2));


        }

    }



