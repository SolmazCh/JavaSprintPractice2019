package OfficeHours.Practice_05_06_2020;

public class Developer {

    String name;
    String jobTitle;
    double salary;
    long employeeID;


    public void setInfo(String name, String jobTitle, double salary, long employeeID){
        this.name =name;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.employeeID=employeeID;
    }

    public String toString(){
        return "Name: "+name+", job title: "+jobTitle
                +", salary:$"+salary+", ID: "+employeeID;
    }


    public void coding(){
        System.out.println(name+" is coding");
    }


    public void fixingBug(){
        System.out.println(name+" is fixing the bug");
    }




}
