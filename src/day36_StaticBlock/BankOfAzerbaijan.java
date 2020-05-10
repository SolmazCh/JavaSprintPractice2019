package day36_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(HumanResources2.employee1,HumanResources2.employee4));

        for(Employee each: employees){
            System.out.println(each);
        }





    }
}
