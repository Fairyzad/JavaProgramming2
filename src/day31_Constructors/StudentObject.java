package day31_Constructors;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Dan",12,'M','B',13);
        Student student2 = new Student("Olya",13,'F','C',15);

        System.out.println(student1);
        System.out.println(student2);
    }
}
