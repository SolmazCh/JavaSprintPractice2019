package day35_Static;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setOfferInfo(String location, String company, double salary, boolean isFullTime){
        this.company=company;
        this.location=location;
        this.salary=salary;
        this.isFullTime= isFullTime;

    }

    public String toString(){
        return "Company name: "+company+", location: "+location+", salary: $"+salary+", is full time: "+isFullTime;
    }




}
