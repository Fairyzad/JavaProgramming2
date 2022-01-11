package day17_WhileDoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // username :"Cydeo"
        //password:"Cydeo123"

        int attempt = 3;
        System.out.println("Enter your username:");
        String u =scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){// if credentials are valid
            System.out.println("Logged in");
        }else {  //the credentials are invalid
            int attempts = 3;
            while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts >0){
                if (attempts == 1){
                    System.out.println("This is your last chance");// while the credentials are invalue
                }
                System.out.println("Incorrect username or password, please re=enter");
                System.out.println("Enter your username:");
                u= scan.next();

                System.out.println("Enter your password:");
                p= scan.next();
                attempts--;
            }
            if(u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked");
            }
        }

        // while(invalid && hasAttempts)

        for (int i = 1; i <=3 ; i++) {


            }

        }
    }

