package practice_12_8_2021;

import java.util.Scanner;

public class FirstTwoLetters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = input.nextLine();

        if (word.isEmpty()) {
            System.out.println("It can not be empty");
        } else if (word.length() <= 2) {
            System.out.println(word);
        } else {
            System.out.println(word.substring(0, 2));// for substring is not including last number.
        }
    }
}
