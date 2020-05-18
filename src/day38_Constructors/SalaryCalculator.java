package day38_Constructors;

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.federalTaxRate=federalTaxRate;
        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate;
        this.weeklyHours=weeklyHours;
    }
    public double salary(){
        return hourlyRate*weeklyHours*48;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return  salary()-stateTax()-federalTax();
    }
    public String toString(){
        return "State tax: "+stateTax()+", Federal tax: "+federalTax()+", hourly rate: "+hourlyRate+", weekly hours: "+weeklyHours+", salary: "+salary();
    }

}

class EmployeeSalary{
    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator(52,40,8.25/100,0.2);

        System.out.println(employee1);


    }
}