package day13_StringClass;

public class StringLiterals {

    public static void main(String[] args) {

        String str1 = "Cat";
        String str2 = new String("Cat"); // Java Heap  // string pool
        System.out.println(str1+ " : "+str2);
        System.out.println((str1==str2));  // it gives false, because they are different objects

    String str3 = "Cat"; // String pool

        System.out.println(str1 == str3); //true,

        String str4 = new String("Cat");

        System.out.println(str2 == str4); // false, those 2 are independent objects

        String s1 = "Java"; // string pool, immutable(deyiwmezdi) we cannot modified (deyiwe bilmirik) it
         s1 = "Javascript"; // new object will be cerated in a memory

        System.out.println(s1);


        String s2 = "Java";

        System.out.println(s1==s2); //false
        //              "Javascript" == "Java"

















    }



}

