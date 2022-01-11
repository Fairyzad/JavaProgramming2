package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 13","6.7 inches","Gold",1000);

        Samsung samsung = new Samsung("galaxy s19","6 inches", "White", 900);

        Nokia nokia = new Nokia("Brick"," 4 inches","Gray",50);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123790);
        iphone.faceTime(39899);
        iphone.faceTime("yiioi@live.com");

        System.out.println("------------------------------------");

    }
}
