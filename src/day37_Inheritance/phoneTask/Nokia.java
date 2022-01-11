package day37_Inheritance.phoneTask;

public class Nokia extends Phone{


    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefence(){
        System.out.println(brand + " " + model + " " + " has self defencing itself");
    }


}
