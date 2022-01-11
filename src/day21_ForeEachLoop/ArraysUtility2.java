package day21_ForeEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String [] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};

        String [] earlyBirds = Arrays.copyOf(students,3);// copy method starts from first elements

        System.out.println(Arrays.toString(earlyBirds));

        int[]numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers,5); //{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));

        char [] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char [] ch2 = Arrays.copyOfRange(ch1,2,6+1);
        // ending index is excluded so we need add 1
        System.out.println(Arrays.toString(ch2));

        int [] scores = {10,20,30,40,50,60,70,80,90,100};
        //
        int []result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));


    }
}
