package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Testers testers1 = new Testers();

        testers1.setTesterInfo("Davud",144578964, "SDET", 140000);

        Testers testers2 = new Testers();
        testers2.setTesterInfo("Venera",234567834,"Senior SDET",110000);

        Testers testers3 = new Testers();
        testers3.setTesterInfo("Michael", 234567654,"Manual Tester", 95000.00);

        ArrayList<Testers> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(testers1, testers2, testers3));

        testers.removeIf(p-> !p.jobTitle.contains("SDET"));

        double totalBudget=0;
        for(Testers each: testers){
            System.out.println(each);
            totalBudget+=each.salary;
        }

        System.out.println(totalBudget);








        ArrayList<Testers> AutomationTeam = new ArrayList<>();









    }

}
