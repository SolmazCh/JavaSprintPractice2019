package OfficeHours.Practice_05_13_2020;

public class Student {
    String name;
    long id;
static String schoolName ="Cybertek";

   public String toString(){
        return "Name: "+name+", id: "+id+", School name: "+schoolName;
    }

    public static  void printSchoolName(){
        System.out.println(schoolName+" School");
    }



}


   class StudenObject{
    public static void main(String[] args) {
        Student studen1 = new Student();
        studen1.name="Madina";
        studen1.id=132;

        Student student2 = new Student();
        student2.name ="Emrah";
        student2.id=456;
        studen1.schoolName="Harvard";
        System.out.println(studen1);
        System.out.println(student2);
    }
}