package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
       dog.SetInfo("Max","Husky","Small","white and black",'M',2);

       dog.eat();
       dog.bark();
       dog.sleep();
       dog.drink();
       dog.move();
       // dog.hunt();
        // dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat();
       cat.SetInfo("Tarcin","British","Small","brown",'M',3);

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.SetInfo("sher Khan","Bengal","Large","Orange",'F',4);
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);

        //  tiger.bark();




    }
}
