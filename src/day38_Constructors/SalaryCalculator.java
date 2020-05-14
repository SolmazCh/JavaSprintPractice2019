package day38_;

public class SalaryCalculator {
    int hourlyRate;
    byte weeklyHours;
    double stateTaxRate;
    double federalTaxRate;


    public SalaryCalculator(int hourlyRate, byte weeklyHours, double stateTaxRate, double federalTaxRate){
        this.federalTaxRate=federalTaxRate;
        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate;
        this.weeklyHours=weeklyHours;
    }

    public double salary(){
        double salary=0;
        return salary;
    }

    public double salaryAfterTax(){
        double afterTax=0;
        return afterTax;
    }


    public double stateTax(){
        double totalStateTax=0;
        return totalStateTax;
    }

    public double federalTax(){
        double fedTax=0;
        return fedTax;
    }

    public String toString(){
        return "hourly rate: "+hourlyRate+", weekly hours: "+weeklyHours+", salary: "+salary();
    }


}
