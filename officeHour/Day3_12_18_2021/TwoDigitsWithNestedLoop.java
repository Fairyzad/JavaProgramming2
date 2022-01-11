package Day3_12_18_2021;

public class TwoDigitsWithNestedLoop {

    public static void main(String[] args) {

        // AB=10*A+B
        // 23= 10*2 +3
        for (int a = 1; a < 9 ; a++) {
            for(int b = 0; b <= 9; b++){
                int ab = 10*a+b;
                System.out.print(ab + " ");
            }

        }
    }


}
/*
                writing two-digits numbers with nested loops
                hint:
                AB=10*A+B
                */

/*
                writing three-digits numbers with nested loops
                hint:
                ABC=100A+10B+C
                */