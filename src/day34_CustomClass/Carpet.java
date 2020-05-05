package day34_CustomClass;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double carpetWidth, double carpetLength, double carpetPrice, boolean Persian){
        width=carpetWidth;
        length=carpetLength;
        unitPrice= carpetPrice;
        isPersian =Persian;
    }

    public double calcCost(){
        double price = (width+length)*unitPrice;
        if(isPersian){
            price+=200;
        }
        return price;
    }

    public String toString(){
        String result ="Width is: "+width+"\nLength is: "+length+"\nUnit price is: $"+unitPrice+"\nPersian: "+isPersian+"\nTotal price is: $"+calcCost();

        return result;
    }












}
