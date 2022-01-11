package day10_NestedIf;

public class EligibleForAlcohol {
    public static void main(String[] args) {
        int age = 19;
        boolean hasId = true;

        if (hasId) {// if the person has ID if
            if (age >= 21) System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not Eligible to buy alcohol");
        }

    }
}

