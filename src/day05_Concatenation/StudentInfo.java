package day05_Concatenation;

/*
Create a class called StudentInfo, and declare variables for the followings:
                1. student name //string
                2. age //int
                3. gender //char
                4. school name// school
                5. phone number //string (##)-##-###
                6. full time //boolean

 */

public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "Peri";
        int age = 36;
        char gender = 'F';
        String school_name = "Cydeo";
        long phoneNumber = 911;
        boolean isFullTime = true;
        double GPA = 2.5;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("GPA = " + GPA);
        System.out.println("isFullTime = " + isFullTime);
    }

}
