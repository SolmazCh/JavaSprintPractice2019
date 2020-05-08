package day35_Static;

public class student { // for Cybertek Only
    String name;
    int id;
    double gpa;
    static String SchoolName  ="Cybertek";


    public void setInfo(String name, int id, double gpa){ // if we are using instance, the method sould not be static
        this.gpa=gpa;
        this.id=id;
        this.name=name;
    }

    public static void PrintSchoolName(){
        System.out.println("School name is: "+SchoolName);
    }

    public String toString(){
        return "Name is: "+name+", School name: "+SchoolName;
    }





}
