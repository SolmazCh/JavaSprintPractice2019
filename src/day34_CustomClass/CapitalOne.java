package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Testers testers1 = new Testers();
        testers1.setTesterInfo("Muhtar", 123, "Manual Tester", 120000);




        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(testers1);

        System.out.println(scrum.testersTeam.size());

        scrum.fireTester(125);

        System.out.println(scrum.testersTeam.size());


    }
}
