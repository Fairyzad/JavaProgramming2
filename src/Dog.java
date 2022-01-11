public class Dog {


        public String name; // instance variable
        public String breed;
        public int age;
        public char gender;
        public String size;
        public String color;

        public void setInfo(String dogName,String dogBreed,int dogAge,char dogGender,String dogSize,String dogColor){

            name = dogName;
            breed=dogBreed;
            age = dogAge;
            gender = dogGender;
            size = dogSize;
            color = dogColor;
        }

        public void eat(){
            System.out.println(name + "is eating");
        }

        public void bark(){
            System.out.println(name + " is barking");
        }


        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

}

class DogObjects {
    public static void main(String[] args) {

        day30_CustomClass.Dog dog1 = new day30_CustomClass.Dog(); // dog object

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        day30_CustomClass.Dog dog2 = new day30_CustomClass.Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        day30_CustomClass.Dog dog3 = new day30_CustomClass.Dog();
        dog3.setInfo("Jack", "German sherpard", 2, 'M',
                "Large", "Black");


        System.out.println(dog1);
        System.out.println(dog2);

    }


}