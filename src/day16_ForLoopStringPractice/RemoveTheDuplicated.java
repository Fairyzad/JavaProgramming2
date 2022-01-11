package day16_ForLoopStringPractice;

public class RemoveTheDuplicated {
    public static void main(String[] args) {

        String str = "AABBCCBC";

        String result = ""; //ABC
        // i<=7 ==> i < 8-->str.length()=8
             //            i <=7
        for (int i = 0; i <= str.length()-1 ; i++) { //i:

           String ch = "" + str.charAt(i); // represents each Character of str 2.concasting char to string + ""

            if (!result.contains(ch)){// if the character is not contained in the result

                result += ch;


            }

        }


        System.out.println(result);


    }
}
/*
. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

 */