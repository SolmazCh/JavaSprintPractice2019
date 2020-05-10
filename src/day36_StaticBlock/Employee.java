package day36_StaticBlock;

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
