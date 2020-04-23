package OfficeHours.Practice_02_11_2020;

public class SalaryCalculater {

    public static void main(String[] args) {

      /*
     write a program that can calculate the tax,
      and salary after tax based
      on the hourly rate & tax rates
			ex:
				if: 
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD

       */


      double rate = 55;
      double stateTaxRate = 0.04;
      double federalTaxRate = 0.22;
      byte weeklyHours = 40;


        double salary = rate*weeklyHours*48;
        double federalTax=salary*federalTaxRate;
        double stateTax= salary*stateTaxRate;
        double totalTax = federalTax+stateTax;
        double incomeafterTax =salary-(stateTax+federalTax);






        System.out.println("Your salary is "+salary+" USD");
        System.out.println("Your total tax is "+ totalTax+" USD");
        System.out.println("Your income after tax is "+incomeafterTax+" USD");
        System.out.println("Your take home after salary is "+incomeafterTax);



    }






}
