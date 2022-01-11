package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990@";

        int countUpperCase = 0;
        int countLowercase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase ++; // increasing by 1
            }else if(Character.isLowerCase(each)){
                countLowercase++;
            }else if(Character.isDigit(each)){
                countDigits ++;
            }else{
                countSpecialChar ++;
            }

        }
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowercase = " + countLowercase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countSpecialChar);

        boolean hasUpperCase = countUpperCase >0;
        boolean hasLowerCase = countLowercase >0;
        boolean hasDigit = countDigits >0;
        boolean hasSpecialChar = countSpecialChar >0;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasSpecialChar && hasDigit
                && hasLowerCase && hasUpperCase;

        System.out.println("strongPassword = " + strongPassword );

    }
}
