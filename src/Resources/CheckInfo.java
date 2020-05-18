package Resources;


import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);
      //  System.out.println(PersonalInfo.grade); // this is not public, default can not call in another package
       //  System.out.println(PersonalInfo.age); also default can not be called in another package
        // System.out.println(PersonalInfo.ID); // ID is private can not call any other classes and packages
        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);
       // System.out.println(obj.age); // default can not called





    }
}
