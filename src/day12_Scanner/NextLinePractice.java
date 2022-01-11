package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt(); //19Enter

        input.nextLine();//take out from enter key from line 10

        System.out.println("Enter your full name");
        String fullName = input.nextLine(); //  enter

        System.out.println("Enter your GPA: ");
       double GPA = input.nextDouble(); //3.5Enter

        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA =" +GPA);
        System.out.println("School name = " + schoolName);

     input.close();

    }
}
/*
1.Ask user to enter age (nextInt())
2. full name (nextLine)

 */