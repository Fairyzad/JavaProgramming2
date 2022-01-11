package day05_Concatenation;

import javax.lang.model.SourceVersion;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Katy";
        String lastName = "Perry";
        int age = 19;
        String jobTitle = "SDET";
        double salary = 100000.58;
        String companyName = "Apple Inc";

        String fullName= firstName + " " + lastName;


        //Full name of the person is______
        System.out.println("Full name of the person is  " + fullName);

        //_____ is____years old
        System.out.println(fullName + " is "+ age + " years old");

        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and "
                +fullName + "'s salary is $" + salary);





    }
}
