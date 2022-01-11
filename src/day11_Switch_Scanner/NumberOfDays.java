package day11_Switch_Scanner;

/*
28 days :2
30 days: 4,6,9,11
31days: 1,3,,5,7,8,10,12
If (1~12){
}else {invalid}
 */

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;
        int year = 2000;
        String result = "";


        if (number >=1 && number <=12){// number:1 to 12
            switch (number){
                case 2:
                   if(year%4 ==0){ //    also can write like this :result= year % 4 ==0)? "29 days' "28 days";
                       System.out.println("29 days");
                   }else {
                       System.out.println("28 days");
                   }
                    break;

                case 4 : case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;

                default://it could 1,3,5,7,,8,10,12
                    System.out.println("31 days");
            }

        }else {
            System.out.println("Invalid Number");
        }




    }
}
