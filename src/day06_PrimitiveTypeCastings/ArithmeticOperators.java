package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1); //121 concatenation
        System.out.println( 10 + 20); //30,addition
        System.out.println(100 - 50); // 50, subtraction
        System.out.println(10 * 5); //50, multiplication

        System.out.println(100/3);//33
        System.out.println(10.0 /4);
        System.out.println(10/ 4.0);
        System.out.println(10d/4);//d stands for decimal

        int a = 100;
        double b = a/6; //16
        // double b= 16


        System.out.println(b);

        double c =a/6.0; //16.6666
        System.out.println(c);

    }
}

/*
Divison

in math:
10/4 =2.5

100/3 = 33.3333

in Java
10.0/4= 2.5
10/4= 2

100/3= 33
 */