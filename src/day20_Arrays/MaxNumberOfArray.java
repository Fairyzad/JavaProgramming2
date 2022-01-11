package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers ={10,5,4,20,1,0};
        int max = numbers[0]; //10 // assume the first number is max number

        for (int i = 0; i < numbers.length -1; i++) { //loop through each and every item

            if(numbers[i]> max){//if there is element in the array that's greater than the current max number
                max = numbers[i]; //assigning greater number to variable max

            }
        }
        System.out.println(max);
    }
}
