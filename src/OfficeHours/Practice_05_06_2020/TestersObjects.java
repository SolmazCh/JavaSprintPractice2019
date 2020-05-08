package OfficeHours.Practice_05_06_2020;

import Resources.Test;

public class TestersObjects {

    public static void main(String[] args) {

        Tester tester1 = new Tester();

       tester1.name="Muhtar";
       tester1.jobTitle="SDET";
       tester1.salary =90000;
       tester1.employeeID=123456678;

        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setInfo("Solmaz", "SDET", 130000, 1212323212);
        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();


        tester2.creatingTicket();



    }
}
