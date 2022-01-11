package day35_Encapsulation;

public class Person {

    public String name; // public is you can use out sideof pacakage.String name is default excess
                        // modifier and can not usde at outside of pacakage.
    public int age;
    public char gender;
    public String language;// instance class belongs to object, object comes from class.


    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead; //  call static variable and block through the class

    public Person(String name, int age,char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language; // this. keyboard is for calling instance variable. using contructor to define object.
    }

    static {
        planet= "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings =0;
        numberOfHead = 1;
    }
    // objects came from class so it shares everything, static and instance.

    public static void printPlantName(){
        System.out.println("plant name is " + planet);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
/*
2. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString() is instance method and it can accepts static method, but static method only accepts static
                method.
 */