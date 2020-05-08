package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {

    String name;
    ArrayList<Testers> testersTeam = new ArrayList<>();
    ArrayList<Developers> developersTeam = new ArrayList<>();


    public void hireTester(Testers testers){
            testersTeam.add(testers);
    }

    public void fireTester(long employeeID){
        testersTeam.removeIf(p-> p.employeeID ==employeeID);
    }

    public void hireDevelopers(Developers developers){
        developersTeam.add(developers);
    }

    public void fireDevelopers(long employeeID){
        developersTeam.removeIf(p->p.employeeID==employeeID);
    }

    public void dailyStandUp(){

    }




}
