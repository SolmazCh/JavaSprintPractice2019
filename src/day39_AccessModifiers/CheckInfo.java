package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);
       // System.out.println("Grade: "+PersonalInfo.grade); private can not be called
       // System.out.println("SSN: "+PersonalInfo.SSN); SSN private gives error when you call in other class
        System.out.println("Age: "+PersonalInfo.age); // you can call default in same package, but not in other package, only if import the package

  PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.gender);
        System.out.println(obj.grade);
       // System.out.println(obj.ID); no access





    }
}
