package OfficeHours.Practice_05_13_2020;

public class Constructor {


    public Constructor(){
        System.out.println("default constructor");
    }



    public static void main(String[] args) {
        Constructor obj = new Constructor();

        Employee employee1 = new Employee("Canan",1234,125000 );
        System.out.println(employee1);
    }


}

class Employee{
    String name;
    long id;
    double salary;

    public Employee(String name, long id, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+name+", id: "+id+", salary: "+salary;
    }


}