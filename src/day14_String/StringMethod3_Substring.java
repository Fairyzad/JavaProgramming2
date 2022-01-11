package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring (begining index, ending index)

        String word = "Cydeo School";
        //             0123456789

       String brand = word.substring(0,4 + 1);

        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);

        System.out.println("-------------------------------------");

        String word2 = "Java Programming Lanuage";

        String s1 = word2.substring(0,word2.indexOf(" "));// benging index and ending index,
        // in the substring only include all the character,excluded the space.

        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));//second word in the sentence is start after first space.
        String s3 = word2.substring(word2.lastIndexOf(" ") +1 );

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
