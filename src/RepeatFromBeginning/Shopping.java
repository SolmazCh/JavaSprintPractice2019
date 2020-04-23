package RepeatFromBeginning;

import java.util.Scanner;

public class Shopping {

        public static void main(String[] args) {

            String item1 = "";
            String item2 = "";
            String item3 = "";
            String report = "";
            double price1 = 0.0;
            double price2 = 0.1;
            double price3 = 0.2;
            double totalPrice = 5.5;
            int count1 = 1;
            int count2 = 2;
            int count3 = 3;


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Item1, count and its price:");

            item1 = scan.next();
            count1 = scan.nextInt();
            price1 = scan.nextDouble();


            System.out.println("Enter Item2, count and its price:");

            item2 = scan.next();
            count2 = scan.nextInt();
            price2 = scan.nextDouble();


            System.out.println("Enter Item3, count and its price:");

            item3 = scan.next();
            count3 = scan.nextInt();
            price3 = scan.nextDouble();

            if (count1 > 0 && count2 > 0 && count3 > 0) {
                totalPrice = (count1 * price1 + count2 * price2 + count3 * price3);
                price1 = count1 * price1;
                price2 = count2 * price2;
                price3 = count3 * price3;
                report = "Item1: " + item1 + " Price: " + price1 + ", Item3: " + item3 + " Price: " + price3;
            } else if (count1 > 0 && count2 == 0 && count3 > 0) {
                totalPrice = count1 * price1 + count3 * price3;
                price1 = count1 * price1;
                price2 = price2;
                price3 = count3 * price3;
                report = "Item1: " + item1 + " Price: " + price1 + ", Item3: " + item3 + " Price: " + price3;
            }


            System.out.println(report);
            System.out.println("Total price: " + totalPrice);

        }
    }

