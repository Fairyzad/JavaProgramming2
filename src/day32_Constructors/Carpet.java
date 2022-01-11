package day32_Constructors;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;
    // constructor name should always same as the class name
    //                  5.5
    public Carpet(double width,double length,double unitPrice,boolean isPersian) { // if the name local variable and instance varibale are same, we use this.method
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice += 200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + calcCost() +
                '}';
    }
}
/*
5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total
                        cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitPrice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */