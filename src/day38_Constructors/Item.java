package day38_Constructors;
/*
create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }

    public double calcCost(){
        return quantity*unitPrice;
    }


    public String toString(){
        return "Item: "+name+", Unit price: "+unitPrice+", Quantity: "+quantity+", Total price: $"+calcCost();
    }

}

class ShoppingList{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Item item1 = new Item("potato", 2.50, 2);
        Item item2 = new Item("bread", 1, 3);
        Item item3 = new Item("butter", 3.50,2);
        Item item4 = new Item("salt", 0.80,1);
        Item item5 = new Item("tomato", 1.45, 7);


        ArrayList<Item> items = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));

        double total=0;
        for(Item each: items){
            total+=each.calcCost();
        }

        System.out.println("Total price: $"+ df.format(total));

    }
}