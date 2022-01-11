package day32_Constructors;

public class Test {
    public Test(){ //A
        System.out.println("Dev");
    }

    public void Test(){ //A  B
        System.out.println("SDET");
    }

    public static void main(String[] args) {

        Test obj = new Test();

    }
}
