package day21_ForeEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String []words = {"Java Programming","Cydeo School","Wooden Spoon","Early birds","Anger Birds"};

        for(String each : words) {

            System.out.println(each.charAt(0) + each.charAt(each.length()-1)); // every single char has a number
                                                                           // so here + will be addition

        }
    }
}
