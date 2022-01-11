package Day3_12_18_2021;

public class ThreeDigitsWithNestedLoop {

    public static void main(String[] args) {

        // ABC=100A+10B+C
        // 220 = 100*2 +10*2 +0

        for (int a = 1; a < 9; a++) {  //a canot be 0;
            for (int b = 0; b < 9 ; b++) {
                for (int c = 0; c < 9; c++) {

                    int abc = 100*a +100*b+c;
                    System.out.println(abc);

                }
            }

        }
    }
}

/*
                writing three-digits numbers with nested loops
                hint:
                ABC=100A+10B+C
 */