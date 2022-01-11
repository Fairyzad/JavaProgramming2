package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this(); //Default Constructor
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(10); // or call this(); only can call one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
       ConstructorCalls obj1 = new ConstructorCalls();
    }
}
