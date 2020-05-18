package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
      //  System.out.println(Zarina.SSN);
        Zarina.setSSN(124569);
        System.out.println("Zarina' SSN: "+Zarina.getSSN());

        Person Maria = new Person("Maria");
        Maria.setSSN(548796554);
        System.out.println("Maria' SSN: "+Maria.getSSN());

        Person Daniel = new Person("Daniel");
        Daniel.setSSN(54712589);
        System.out.println("Daniel' SSN: "+Daniel.getSSN());
        Daniel.setID(589657);
        System.out.println("Daniel' ID: "+Daniel.getID());






    }
}
