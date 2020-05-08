package day34_CustomClass;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;


    public void setOfferInfo(String location, String company, double salary, boolean isFullTime){
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFullTime=isFullTime;
    }

    public String toString(){
        return "Location is: "+location+"\nCompany is: "+company+"\nSalary is: "+salary+"\nisFulltime: "+isFullTime;
    }






}
