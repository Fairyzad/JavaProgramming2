package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");//
        String fullName =  input.nextLine();

        System.out.println("Enter your Programming Language: ");
        String Programming = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //24 Enter nextInt will ingore
        // enter key and enter key left in the scanner

        input.nextLine(); // so we have to clear out scanner's memorry to take out enter key
        // capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine(); //nextLine will read enter key

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + Programming);
        System.out.println("age = " + age);
        System.out.println("schoolName" + schoolName);

         input.close();
    }
}
