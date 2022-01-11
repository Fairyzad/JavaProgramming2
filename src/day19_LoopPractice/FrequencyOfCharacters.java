package day19_LoopPractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
               //     0123456
        String result = "";//b

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i); //each character of string

                if (ch == each) {
                    count++;
                }
            if(result.contains(""+ ch)){
                continue;
            }
            }
            result +=ch;
            result += count;
            System.out.println(count);

        }
    }
}
/*

 */