package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setStudentInfo("Adam", "England", 34,3.5,'M',true);


        System.out.println(student1);

        Student student2 = new Student();
        student2.setStudentInfo("Johnny", "US",40,4,'M',false);

        Student student3 = new Student();
        student3.setStudentInfo("Anna","Ukrainian", 33,2.9, 'F', true);

        Student student4 = new Student();
        student4.setStudentInfo("Zoie","Chinese",16,3.4,'F',false);

        Student[] students ={student1,student2,student3,student4};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));

        canGraduate.removeIf(p-> p.gpa<=3.0);

        System.out.println(canGraduate.size());

        for(int i=0; i<canGraduate.size(); i++){
         String name =canGraduate.get(i).name;
            System.out.println(name+" can graduate");
        }


        ArrayList<Student> canNotGraduate = new ArrayList<>(Arrays.asList(students));
        canNotGraduate.removeIf(p-> p.gpa>3);

        System.out.println(canNotGraduate.size());

        for(Student each: canNotGraduate){
            System.out.println(each.name+" can not graduate");
        }



    }
}
