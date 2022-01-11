package Day4_01_08_2022;

public class X {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 0; i <=5 ; i++) {
            x +=i;

            // 10 = x + i= 10 +0
            // 11   10          1
             //   13               2
              //    16                   3
             //       20             4
             //         25          5

        }
        System.out.println(x);

        System.out.println("-------------------------------------------");

        for (int i = 0; i <=5 ; i++) {
            if(i +2 >5){
                continue;

                // i = 0; 0+2 >5;

            }
            System.out.println(i + " ");

        }
    }



}
