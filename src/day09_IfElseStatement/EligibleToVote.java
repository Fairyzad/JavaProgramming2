package day09_IfElseStatement;

/*
 4. Write a program that can check if the person is eligible to vote
 */
public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Anna";
        int age = 19;
        String ciziten = "USA";
        boolean isEligibleToVote = (age>= 21) && (ciziten =="USA");

        if(isEligibleToVote ){
            System.out.println(age + "is eligible to vote");}
    }
}
