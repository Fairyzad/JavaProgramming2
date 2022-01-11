package day16_ForLoopStringPractice;

public class ReverseAString {
    public static void main(String[] args) {
        String str ="Wooden Spoon"; // Try :String str = I love java, Java is fun programming language.
        //    index: 01234567891011
        String result = ""; //contain the reversed version of str //noo
        /*
           result += str.charAt(11); //n
           result += str.charAt(10); //o
           result += str.charAt(9);  //o
           result += str.charAt(8);  //p
           result += str.charAt(7); // S
           result += str.charAt(6); // ' '
           result += str.charAt(5); //n
           result += str.charAt(4);
           result += str.charAt(3);
           result += str.charAt(2);
           result += str.charAt(1);
           result += str.charAt(0); //W

        result += str.charAt(str.length()-1);//n  last data = str.length()-1

*/

       //last index number = str.length()-1;length()
        //length() method counts the number of characters, not their index position.
        // The end of a string is always length()-1 because the indexes start at 0 but length starts at 1
       // So we find the index of the last character of any string but counting back one from the total
       // number of characters in the string.

        for(int i = str.length()-1; i >= 0; i--){ // i : index numbers of str (starting last index to index 0)
           result += str.charAt(i);// this + is concatination to adding each character to result
        }
        System.out.println(result);

    }














}
/*
. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */