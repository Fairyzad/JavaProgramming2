package day27_WrapperClasses;

import jdk.swing.interop.SwingInterOpUtils;

public class WrapperClassMethods {
    public static void main(String[] args) {


        String str = "123";

      int num =  Integer.parseInt(str); // int value

        System.out.println(num + 1); // 124
        System.out.println(str +1);//1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); //double

        System.out.println(num2 +1); // 11.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

       long max2  =Long.MAX_VALUE;
       long min2  =Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);



    }
}
