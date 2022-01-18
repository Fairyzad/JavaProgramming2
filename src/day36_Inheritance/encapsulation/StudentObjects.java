package day36_Inheritance.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {
        Student student1 = new Student("Kii",24,'F','A',"Cydeo");

        student1.setAge(38);

        System.out.println(student1);
    }
}
