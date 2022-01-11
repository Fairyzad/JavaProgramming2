package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        // index of elements:     0 1 2 3   0 1 2 3 4
        int[][] arr2D = {{1,2,3},{4,5,6,9},{7}};
        //  index of arrays:  0     1          2

        for(int [] eachArray:arr2D){

            for(int eachElement:eachArray){
                System.out.println(eachElement);

            }
            System.out.println();




    }
}

}
