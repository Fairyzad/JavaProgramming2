package day17_WhileDoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E'; i++) {

            if(i=='C'){
                continue;
            }

            System.out.print(i);


        }
        System.out.println("-----------------------------" );

        //print all even numbers 1~10 // skip the odd numbers

        for (int i = 1; i <=10; i++) {

            if(i%2 !=0){ // remider is not 0 is odd number
                continue; // skip
            }
            System.out.println(i);
        }
        System.out.println("----------------------------");

        //print all odd numbers 1~10 // skip the even numbers

        for (int i = 1; i <=10 ; i++) {
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);

        }
    }
}
