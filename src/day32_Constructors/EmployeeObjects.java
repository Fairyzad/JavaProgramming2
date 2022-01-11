package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) { //If the other data is unknown , we can have option to not to put their data in the constructor
        Employee employee1 = new Employee("Aaron");
        Employee employee2 = new Employee("Alex",'M');
        Employee employee3 = new Employee("Ali",'M',"QA");
        Employee employee4 = new Employee("Roy",'M',"QA",120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }
}
