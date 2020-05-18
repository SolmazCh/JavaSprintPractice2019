package day39_AccessModifiers;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Rustam");

        System.out.println(employee1);

        Employee employee2 = new Employee("Sevinj","PO");

        System.out.println(employee2);

        Employee employee3 = new Employee("Jacob", "SDET", 123);
        System.out.println(employee3);

    }
}
