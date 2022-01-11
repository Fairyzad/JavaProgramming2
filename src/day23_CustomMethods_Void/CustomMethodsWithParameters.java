package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {


    public static void main(String[] args) {

       // oddOrEven();                      // the method demands additional info to complete its task

        oddOrEven(11);

        ageOfPerson(2002);

    }

    //creat a function that can check if a number is odd number or even number

    public static void oddOrEven(int number){  //10

        if(number % 2 == 0){

            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }

    // creat a function that can display the age of the person

    public static void ageOfPerson(int birthYear){ // void can not print number so diplay it

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);


    }
}
