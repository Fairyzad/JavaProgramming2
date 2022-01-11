package day15_ForLoops;

public class ForLoopPractices {
    public static void main(String[] args) {

    int sumOf10 = (((1) + 2) + 3) + 4 + 5 + 6 + 7 + 8 + 9 + 10;
    int sumOf50 = 0;

    for (int i = 1;
         i <= 50;
         i = i + 1)  {
        sumOf50 = sumOf50 + i;
    }

        System.out.println(sumOf50);
























/*
        //15 16 17 18 ......45

        for (int i = 15; i <= 45; i++) {// i:
            System.out.print(i + " "); // this print method doesn't append a new line.
        }
        System.out.println(); // starts a new line
        System.out.println("Hello");

        // 100 ~50

        for (int i = 100; i >= 50; i--) { //i: 100,99,98,97,96,.....50, relation operators: >=, <=.<,>
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------------------------------");

        // print all the even number between 1 ~ 55

        for (int i = 1; i <= 55; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        for (int i = 2; i <= 54; i += 2) {// i: 2 4 6 8 .....54
            System.out.print(i + " ");
        }
        System.out.println("------------------------------");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        for (char i = 1; i <= 40000; i++) {
            System.out.print(i + " ");
        }
*/
    }

}
