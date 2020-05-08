package OfficeHours.Practice_05_06_2020;

import day34_CustomClass.ScrumTeam;

public class AppleINC {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,1245);


        Tester tester3 = new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);

        ScrumTeam1 scrum1 = new ScrumTeam1();

        scrum1.hireATester(tester3);

        scrum1.hireATester(tester1);

        scrum1.hireATester(tester2);

        // scrum1.testersTeam // returns the testersTeam arrayList form scrum1

        scrum1.fireATester(1245);
        for( Tester each: scrum1.testersTeam){ // prints out every single tester from scrumteam
            System.out.println(each);
        }
        System.out.println("=================================================================");
        Developer developer1 = new Developer();
        developer1.setInfo("Jack","Senior Developer",180000,12546);

        Developer developer2 = new Developer();
        developer2.setInfo("Barzy","Senior Developer",220200,1122337);
        scrum1.hireDeveloper(developer1);
        scrum1.hireDeveloper(developer2);

        scrum1.fireDeveloper(1122337);

        System.out.println(scrum1.devTeam.size());

        for(Developer each: scrum1.devTeam){ // arraylist of developer in scrum team
            System.out.println(each);
        }

        System.out.println("In my Scrum team, We have "+scrum1.testersTeam.size()+" testers and "+scrum1.devTeam.size()+" developers");

     //=======================================================================================================

        ScrumTeam2 scrum2 = new ScrumTeam2();

        Developer developer4 = new Developer();
        developer4.setInfo("Tural", "Developer", 150_000, 14546);

        Developer developer3 = new Developer();
        developer3.setInfo("Namaz", "Developer", 95000, 4579);

        Developer developer5 = new Developer();
        developer5.setInfo("Feride","developer", 75000,4578);

        Developer developer6 = new Developer();
        developer6.setInfo("Asiya", "developer", 110000,7896);


        scrum2.hireDeveloper(developer3);
        scrum2.hireDeveloper(developer4);
        scrum2.hireDeveloper(developer5);
        scrum2.hireDeveloper(developer6);

        scrum2.fireDeveloper(7896);
        scrum2.fireDeveloper(4578);
        scrum2.fireDeveloper(4579);
        scrum2.fireDeveloper(14546);


    }
}
