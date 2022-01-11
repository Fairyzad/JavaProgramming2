package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int number = 6;

       String name = (number == 1)? "January" :(number ==2)? "Februrary" :(number == 3)? "March"
                :(number == 4)? "April" :(number == 5)? " May" :(number ==6)?
                "June" :(number == 7)? "July" :(number == 8)? "August"
                : (number== 9)? "Sep" : (number == 10)? "Oct" :(number== 11)? "Nov" : "Dec";

        System.out.println(name);

    }
}
