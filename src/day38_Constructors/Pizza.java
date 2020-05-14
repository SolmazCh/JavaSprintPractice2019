package day38_;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    String size;
    int cheeseTop;
    int pepperoniTop;


    public Pizza(String size, int cheeseTop, int pepperoniTop) {
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepperoniTop = pepperoniTop;
    }


    public double calcCost() {
        size = size.toLowerCase();
        double cost = 0;

        if (size.equals("small")) {
            cost += 10;
        } else if (size.equals("medium")) {
            cost += 12;
        } else if (size.equals("large")) {
            cost += 14;
        } else {
            System.out.println("Sorry, this size is not available");

        }

        cost += 1.5 * pepperoniTop + cheeseTop;
        return cost;
    }


    public String toString() {
        return size + ", cheese topping count: " + cheeseTop + ", pepperoni topping count: " + pepperoniTop + ", Total price: " + calcCost();
    }

}



    class Order{
        public static void main(String[] args) {

            Pizza pizza1 = new Pizza("small",2,2);
            Pizza pizza2 = new Pizza("medium", 3,1);
            Pizza pizza3 =new Pizza("LaRge",0,2);
            Pizza pizza4 =new Pizza("Large",5,1);
            Pizza pizza5 = new Pizza("Medium",4,0);

            ArrayList<Pizza> orders = new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));
            double totalPrice=0;
            for(Pizza each:orders){
                totalPrice+=each.calcCost();
            }

            System.out.println("$"+totalPrice);



        }
    }


















