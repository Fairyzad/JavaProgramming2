package day24_CustomMethods_return;

public class Return_Vs_exitMethod {

    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello World");

    }

    public static void nameOfMonth(int number){

        if (number <1 || number >12){ // number = 30
            System.out.println("Invalid");
           // return; //exits nameofMonth method, remaining code fragments of the method never gets executed

            System.exit(0); // whole program will be terminated
        }


        String name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                :(number==11)?"Nov" : "Dec";


        System.out.println("Month name = " + name);
    }

}
