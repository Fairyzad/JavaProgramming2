package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // creative a variable that's capable enough to contain 5 names

      String []myGroup = new String[5]; // 5 is the size of array, [] is single dimensional Array
       myGroup[0] = "Gunay";
       myGroup[1] = "Neira";
       myGroup[2] = "Suat";
       myGroup[3] = "Hulya";
       myGroup[4] = "Michael";


       // System.out.println(myGroup); //  you will get hash code.

        System.out.println(Arrays.toString(myGroup));//

        System.out.println("--------------------------------------------------");
        String[]days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
             //             0       1           2             3           4     5       6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number<1 || number >7){ // terminated the program to call exit method.
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("--------------------------------------------------------");
        String []months ={"Jan","Feb","Mar","April","May","June","July","August","September","October",
                "November","December"};
        System.out.println(Arrays.toString(months));

        for (int i = 0; i < months.length; i++) {// index number always less than length 1,
            System.out.println(months[i]);           // i represents the index numbers of array starting from 0
        }

        System.out.println("-------------------------------------------------------");
              // last index number
        for (int i = months.length -1; i>=0; i--) { // i is stands for from last index number to 0;
            System.out.println(months[i]);
        }

    }
}
