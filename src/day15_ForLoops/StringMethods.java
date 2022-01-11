package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        // Yes,YES,yES,......

        System.out.println("Yes".equalsIgnoreCase("YEs"));

        System.out.println("---------------------------------------------");
        String sentence = "MY favorite programming language is Java";

        boolean hasCsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java"); //jAvA

        System.out.println(hasCsharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("------------------------------------------------------");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("Java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("--------------------------------------------");



    }
}
