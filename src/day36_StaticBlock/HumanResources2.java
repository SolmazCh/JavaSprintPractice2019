package day36_StaticBlock;

public class HumanResources2 {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();


    static {
        employee1.setEmployeeInfo("Davud",142563,784512,"SDET",125000,'M');
        employee2.setEmployeeInfo("Solmaz", 457896,635289,"Junior SDET",95000,'F');
        employee3.setEmployeeInfo("John", 5487966,548796161,"Developer",140000,'M');
        employee4.setEmployeeInfo("Julia",548799,2335566,"Developer",135000,'F');
        employee5.setEmployeeInfo("Diana", 846674,64879416,"Product Owner", 150000,'F');

    }










}
