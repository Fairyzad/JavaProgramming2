package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Dan",'M',25,120000);

        System.out.println(employee1);

        employee1.setAge(32);
                          // get original object
        employee1.setSalary(employee1.getSalary()+ 15000);
        System.out.println(employee1);
    }
}
