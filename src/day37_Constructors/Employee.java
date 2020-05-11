package day37_Constructors;
/*1. Create a class called Employee
        instance variables:
        name, id, ssn, jobTitle, salary, gender
        actions:
        setEmployeeInfo(): can initialize all the instance variables
        toString(): can return the info of the employee as string
*/
public class Employee {

    String name;
    long SSN;
    String jobTitle;
    long ID;
    double salary;
    char gender;

    public void setEmployeeInfo(String name, long ID, long SSN, String jobTitle, double salary, char gender ){
        this.gender = gender;
        this.ID=ID;
        this.SSN=SSN;
        this.jobTitle=jobTitle;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+name+",ID: "+ID
                +", SSN: "+SSN+", job title: "+jobTitle+", salary: "+salary+", gender: "+gender;
    }






}
