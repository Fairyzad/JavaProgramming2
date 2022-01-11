package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeef";

      /*  ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split(""))); // convert string to array list

        System.out.println("list = " + list);

       */
    // way 2:
        String []arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);
        String unique = "";
        for(String each:list){
            int frequecy = Collections.frequency(list,each);
            if(frequecy == 1){
                unique += each;
            }
        }

        System.out.println("unique = " + unique);

    }
}
