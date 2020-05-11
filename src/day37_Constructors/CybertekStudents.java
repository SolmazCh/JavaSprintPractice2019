package day37_Constructors;

import javax.print.DocFlavor;

public class CybertekStudents {

 static String schoolName;

    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
        schoolName="Cybertek University";
        this.batch=batch;
        this.groupNumber=groupNumber;
        this.studentName=studentName;

    }

    public String toString(){
        return studentName+" "+batch+" "+groupNumber+" "+schoolName;
    }

}


class test{
    public static void main(String[] args) {

        CybertekStudents student1 = new CybertekStudents("Solmaz", 3, "Batch18");
        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Nahide",8,"Batch18");
        System.out.println(student2);

        CybertekStudents student3 = new CybertekStudents("Muhtar", 5,"Batch17");
        System.out.println(student3);
    }
}