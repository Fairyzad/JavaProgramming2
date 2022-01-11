package day03_EscapeSequences;
/*
Escape sequences: Must be given with double quote
 \n: starts a new line
 \t: paragraph space (tab)
 \\: double back slash
 \": double quote

 */


public class EscapeSequence {
    public static void main(String[] args) {
        System.out.println("Java \nPythion \nC# ");
        System.out.println("----------");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next");

        System.out.println("----------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("---------------");

        System.out.println("/ \\");//in order to print one backward slash we need to give two backward slashes

        System.out.println("------------------------");

        System.out.println("My favorite TV show is \"Game of Throne\" ");// in order to print double quote, we need to add\"


    }
}

