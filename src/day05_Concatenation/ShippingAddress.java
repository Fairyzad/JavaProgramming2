package day05_Concatenation;

/*
Create a class called ShippingAddress.java

Declare the following variables:
        name
        buildingNumber
        streetName
        city
        state
        zipCode

        Use concatenation to print the full shipping address

 */

public class ShippingAddress {
    public static void main(String[] args) {

        String name  = "Katy Perry",
               buildingNumber = "02345B",
                streetName ="Shakespeer Dr",
                city = "LA",
                state = "CA",
                zipCode  = "91365A";

        System.out.println(name + "\n" + buildingNumber + "" + streetName + "\n" + city + ", " + state +" " + zipCode
        );

        String shippingAddress = name + "\n" + buildingNumber + "" + streetName + "\n" + city + ", " + state +" " + zipCode;
        System.out.println(shippingAddress);



    }


}
