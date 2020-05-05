package day34_CustomClass;

public class Pizza {
    String size;
    int cheeseTopping;
    int pepperoniTopping;

    public void customizeOrder(String pizzaSize, int CheeseTop, int PepperoniTop){
        size =pizzaSize;
        cheeseTopping=CheeseTop;
        pepperoniTopping=PepperoniTop;
    }

    public double calcCost(){
        size.toLowerCase();
       double cost=0;
        if(size.equals("small")){
           cost+=10;
        }else if(size.equals("medium")){
            cost+=12;
        }else if(size.equals("large")){
            cost+=14;
        }
        if(cheeseTopping>0){
            cost+=cheeseTopping*1;
        }
        if(pepperoniTopping>0){
            cost+=pepperoniTopping*1.5;
        }
return  cost;
    }

    public String toString(){
        String result ="Pizza size is: "+size+"\ncheese topping count: "
                +cheeseTopping+"\npepperoni topping count: " +pepperoniTopping+"\nTotal price is: $"+calcCost();
        return result;
    }






}
