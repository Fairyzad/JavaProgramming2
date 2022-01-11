package day19_LoopPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";// bdf


        for(int j = 0; j <str.length();j++){

            char ch = str.charAt(j); //ind a frequency, you have to compare with every single character by loop
            int count = 0; // represents the frequency of the ch


        for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each characters

            char each =str.charAt(i);//each character of str

            if(ch == each){

                count++;
            }

        }

      // if(count == 1){// if the frequency of the character is 1, the the character is unique.
          result += ch;

        if(count !=1){
            continue;
      }
       result +=ch;

            System.out.println(result);





    }
}

    public static class LoopsWithoutCurlyBraces {

        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {

                System.out.println("Cydeo");
                System.out.println("Batch 25");

            }
        }
    }
}

/*
. Write a program that can return the unique characters from a String

            Ex:
                input:
                    str = "aabccdeef";

                output:
                    bdf

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */