package RepeatFromBeginning;

public class Divisibleby235 {

    public static void main(String[] args) {

        int num = 65;
        boolean divisibleby2 = num%2==0;
        boolean divisibleby3 = num%3==0;
        boolean divisibleby5 = num%5==0;

        System.out.println(num+" is divisible by 2: "+divisibleby2);
        System.out.println(num+" is divisible by 3: "+divisibleby3);
        System.out.println(num+" is divisible by 5; "+divisibleby5);

        int num2 = 120;

        boolean divby2 =  num2%2==0;
        boolean divby3 = num2%3 ==0;
        boolean divby5 = num2%5==0;

        System.out.println(num2+ " is divisible by 2: "+divby2);
        System.out.println(num2+ " is divisible by 3: "+divby3);
        System.out.println(num2+ " is divisible by 5: "+divby5);







    }
}
