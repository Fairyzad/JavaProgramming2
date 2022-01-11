package day24_CustomMethods_return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("cydeo","school");

        System.out.println("--------------------------");

        domain("Cydeo.School@gmail.com");

        System.out.println("--------------------------");

        String [] emails = {"josh@gmail.com","jim@yahoo.com","Elmiur@cydeo.com","Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("--------------------------------");

        nameOfMonth(8);
    }

    //Create a method that can display the initials of the person, initials(String firstName, String secondName)

    public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        initial = initial.toUpperCase();

        System.out.println("initial = " + initial);




    }

    //2. Create a method that can display the domain of the email. domain(String email)

    public static void domain(String email) { //Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);



    }

    //  Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number){

        String name = " ";

        if(number >=1 && number <= 12) { // we can use switch, multibranch, ternary
            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }

    // Create a method that can print the name of the day based on the given number to the method

    // Create a method that can print how many days a month has

    public static void daysInMonth(int number){

        String name = " ";

        if(number >=1 && number <=31){

            boolean has28Days = number == 2; // for the month that has 28 days
            boolean has30Days =  number == 4 || number == 6 || number ==9 || number == 11; // for the months that has 30 days
            boolean has31Days = !has28Days && !has30Days; // if the month does not have 28 days and does not have 30 days


            if(has28Days){ //if the month has 28 days
                System.out.println("28 days");
            }

            if(has30Days){ //if the month has 30 days
                System.out.println("30 days");
            }

            if(has31Days){ // if the month has 31 days
                System.out.println("31 days");
            }

            System.out.println("number ");

        }


    }







}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5.Create a class called AgeGroups, and write a program that can define the age groups of a person

                 age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

 */
