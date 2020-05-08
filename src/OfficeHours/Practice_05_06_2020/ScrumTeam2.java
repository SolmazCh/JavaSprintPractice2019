package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

/*         create scrum2: 4 developers, 2 testers
         create scrum3: 5 developers, 3 testers
             create an array of scrum: {scrum1, scrum2, scrum3};

            1. iterator the array to print out all the testers who have salary > 120000

            2. print out all the developers who have salary < 120000

        create an ArrayList of scrum: {scrum1, scrum2, scrum3};

               1. remove all the testers who have salary < 100000

               2. remove all the developers who have salary < 120000
             NOTE: DO NOT create any ArrayList of Testers or Developers.

                Use the ArrayLists in ScrumTeam class only
   */



public class ScrumTeam2 {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> devTeam = new ArrayList<>();


    public void hireATester(Tester  tester){
        testersTeam.add(tester);
    }
    public void fireATester(long id){
        testersTeam.removeIf( eachTester -> eachTester.employeeID == id);
    }

    public void hireDeveloper(Developer developer){
        devTeam.add(developer);
    }

    public void fireDeveloper(long id){
        devTeam.removeIf(eachDev -> eachDev.employeeID ==id);
    }

}
