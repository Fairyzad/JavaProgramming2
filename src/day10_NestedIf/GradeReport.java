package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90 ~100: excellent
        80 ~89: Great
        70 ~79: Good
        60 ~69: Passed
        0~59: failed
         */

        int score = 95;
        String result = ""; //temporary

        if (score >= 0 && score <= 100) {// if the score is valid
            //5 possibilities: A,B,C,D,E,F
            if (score >= 90) {// failse: score <90 // ("Excellent");
                result = "Excellent";
            } else if (score >= 80) { // failse: score <80
                result="Great";
            } else if (score >= 70) { // failse: socre <70
                result ="Good";
            } else if (score >= 60) { //failse: score < 60}
               result = "Passed";
            } else {
                result= "Failed";
            }


        } else {// if the score is Not Valid
            System.out.println("Invalid Score");// }

        }
        System.out.println("--------------------------------------");


    }
}
