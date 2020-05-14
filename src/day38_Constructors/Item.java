package day38_;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    String name;
    double unitPrice;
    double quantity;

    public Item(String name, double unitPrice, double quantity){
        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }

    public double calcCost(){
        double total = quantity*unitPrice;
        return total;
    }


    public String toString(){
        return "name: "+name+", unit price: "+unitPrice+", quantity: "+quantity+", total price: "+calcCost();
    }

}

class ShoppingList{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Item item1 = new Item("potato", 2.50, 2);
        Item item2 = new Item("bread", 1, 3);
        Item item3 = new Item("butter", 3.50,2);
        Item item4 = new Item("salt", 0.80,1);
        Item item5 = new Item("tomato", 1.45, 2.7);


        ArrayList<Item> items = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));

        double total=0;
        for(Item each: items){
            total+=each.calcCost();
        }

        System.out.println("$"+ df.format(total));

    }
}