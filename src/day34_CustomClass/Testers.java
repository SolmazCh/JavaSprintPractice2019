package day34_CustomClass;

public class Testers {

    String name;
    long employeeID;
    String jobTitle;
    double salary;


    public void setTesterInfo(String name, int employeeID, String jobTitle, double salary){
        this.name =name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }


    public void smokeTesting(){
        System.out.println();
    }

    public  void creatingTicket(){

    }

    public String toString(){
        return "Name: "+name+", job title: "+jobTitle+", employee ID: "+employeeID;
    }







}
