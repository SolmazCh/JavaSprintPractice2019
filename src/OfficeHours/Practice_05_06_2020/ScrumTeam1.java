package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam1 {

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
