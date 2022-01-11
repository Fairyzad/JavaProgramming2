package day09_IfElseStatement;

public class MaximumNumber {
    public static void main(String[] args) {
         int n1 = 20,
             n2 = 30;

         boolean MaximumNumber1 = n1 >n2;
         boolean MaximumNumber2 = n2 >n1;

         if(n1 >n2) {
             System.out.println(n1 + " is maximum number");} else {
             System.out.println(n2 +" is maximum number");
         }
    }
}
