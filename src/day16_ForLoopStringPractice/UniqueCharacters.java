package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCCD";

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) { // i: index numbers of string which starts from 0
            char ch = str.charAt(i);  // ch: each characters of str

            System.out.println(ch);

            if(str.indexOf(ch)==str.lastIndexOf(ch)){ // if the first and last index numbers of the character are same,
                //                                  then it must be a unique character.
                result += ch;

        }

//If a character is unique within a string it means it will not be repeated. IT will only occur once and will only
// have one index number. If the first and last occurrence of that character are the same number,
// then the number only occurs once . That means it is unique

        }

        System.out.println(result);

    }
}
/*
. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique

                  indexOf('A')===>'0'
                  lastIndexOf ('A') ==> '1"

                  indexOf('B') ===>'2'
                  lastIndexOf(B) ====>2


 */