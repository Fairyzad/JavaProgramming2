package day05_Concatenation;

/*
2. Declare the following variables:
1.year
2.make
3.model
4.miles
5.color
6.price
3. Use concatenation to print the full info of the car in
the following format:
Year  Make  Model,  Miles,  Color,  Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.

 */

public class CarInfo {
    public static void main(String[] args) {

        int year = 2002;
        String make = "Toyota";
        String model = "SUV";
        int miles = 50000;
        String color = "White";
        int price = 20000;

        System.out.println( year + " " + make + "," + "miles" + ", " + color + ", " + "$" + price);

        


    }
}
