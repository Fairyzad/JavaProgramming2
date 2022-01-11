package day04_Variables;
/*
Create a class named EmployeeInfo. declare the following variables:
1.name (String)
2.age(int)
3.gender(char)
4.company (string)
5.jobTitle (string)
6.yearsOfExpereince (double)
7.salary (int)
8.isFullTime (boolean)
9.isMarried (boolean)
10.EmployeeId (string)
11. SSN (string)

 */




public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Maria";
        int age = 24;
        char gender = 'F';
        String company = "Apple Inc";
        String jobTitile = "SDET";
        double yearsOfExperience = 2.5;
        int Salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "A101";
        String SSN = "(123)-67-0987";


        System.out.println("name = " + name);
        System.out.println("employeeId = " + employeeId);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("company = " + company);
        System.out.println("jobTitile = " + jobTitile);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("Salary = " + Salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("SSN = " + SSN);

    }
}
