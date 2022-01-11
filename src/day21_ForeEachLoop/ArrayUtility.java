package day21_ForeEachLoop;

import day20_Arrays.ArraysPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {

        int [] scores ={95,100,55,65,85,78};

        Arrays.sort(scores); //{55....100}
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score" + scores[0]);
        System.out.println("Max Score" + scores[scores.length-1]);

        String[]names = {"Gunay","Anna","Zuhal","Ahmet","Maria","Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int [] arr1 = {1,3,2};
        int []arr2 = {1,2,3};

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("--------------------------------------");
        char[]ch1={'a','c','b'};
        char[]ch2= {'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram =" + anagram);






    }
}
