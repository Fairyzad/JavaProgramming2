package day09_IfElseStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a =10,
            b=15,
            c=20;
        // if we have three different numbers, one Must maximum, one Must be minimum and one Must be Median.

        boolean aIsMedianNumber =(a>b && a<c )|| (a>c && a <b);// a=15,b=10,c=20 \\a=15, c=10,b=20
        /*
        in oder for ato be the median number:
        1. if c is the maximum number & b is the minimum number then a is the median number
        2. if b is the maximum number & c is the minimum number then a is the median number
         */
        boolean bIsMedianNumber =(b>c && b<a) ||(b>a && b<a); //b= 15, a=20,c=10,|| b=15,a=10,c=20
        boolean cIsMedianNumber =!aIsMedianNumber &&!bIsMedianNumber;

        if(aIsMedianNumber){ //if a is the median number
            System.out.println(a + " is the median number");} //c

        if(bIsMedianNumber){
            System.out.println(b+" is the median number");}
        if(cIsMedianNumber){
            System.out.println(c + " is the median number");

        }



    }
}


/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
                posibility 1: a could be median number
                           2: b could be median number
                           3: c could be median number
 */