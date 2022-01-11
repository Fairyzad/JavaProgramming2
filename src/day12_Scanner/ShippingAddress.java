package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();//

        System.out.println("Enter your building number: ");
        String buiding = input.next(); //78989AEnter

        input.nextLine();

        System.out.println("Enter your street name");
        String street = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine();//enterenter

        System.out.println("Enter your country");
        String country = input.nextLine();

        input.close();

    }
}
/*
1.enter your full name (nextLine)
2. enter your building number  (next())
3.enter your Street name ---nextLine
4.Enter your city name ----nextLine
5. enter your state---next()
6.enter your zip code -------next


Dispaly the shipping address


 */