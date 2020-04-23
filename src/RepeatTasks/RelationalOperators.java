package RepeatTasks;

public class RelationalOperators {


    public static void main(String[] args) {

        int a =50;
        int b =90;
        boolean greaternum = a>b;
        System.out.println("First number "+a+" is greater than Second number "+b+" :"+greaternum);

        System.out.println(greaternum);

        int AppleCount = 20;
        int OrangeCount = 30;
        int PearsCount =30;
        boolean comp = AppleCount< OrangeCount || OrangeCount>= PearsCount;
        System.out.println(comp); // 20<30 || 30>=30 // false || true == true



    }
}
