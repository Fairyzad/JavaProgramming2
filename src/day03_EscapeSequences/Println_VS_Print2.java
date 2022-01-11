package day03_EscapeSequences;

public class Println_VS_Print2 {
    public static void main(String[] args) {// main method

        System.out.println("Knock Knock"); //first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("---------------------");

        System.out.print("Knock Knock");//first it prints knock knock, does not append a new line
        System.out.print("Who is this?");
        System.out.print("This is Java");
        System.out.println();
        System.out.println("-------------------------");

        System.out.println("Hello everyone, how are you all today? Today we will learn Escape Sequence.");

        System.out.println("---------------------");

        System.out.print("Hello everyone, how are you all today? ");
        System.out.print("");

    }
}

//Single line comment gose here

/*
Comment line 1
Comment line 2
 */