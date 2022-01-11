package day17_WhileDoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";
        String result = ""; //"ABC"

        for (int i = 0; i <str.length() ; i++) {
            String ch = "" + str.charAt(i); // concatination char to string by + "" (EMPTY STRING)

            if(result.contains(ch)){// if the result already contains the character
                continue;//skips
            }

            result += ch;

        }
        System.out.println(result);
    }
}
