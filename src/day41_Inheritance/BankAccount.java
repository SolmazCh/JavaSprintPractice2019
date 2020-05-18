package day41_Inheritance;
/*
	create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */

import jdk.nashorn.internal.ir.BaseNode;

public class BankAccount {
    public static String bankName ="Bank of America";
    public String firstName, lastName;
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public BankAccount(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountHolder=firstName+" "+lastName;
    }
    public void depositing(int amount){
       // balance+=amount;
        setBalance(balance+amount);
    }
    public void withdrawing(int amount){
        if(balance<amount){
            System.out.println("You do not have enough balance to make this process");
        }else {
            setBalance(balance - amount);
        }
    }
    public void availableBalance(){
        System.out.println("Available balance: "+getBalance());
    }
    public String toString(){
        return "Full name: "+getAccountHolder()+", Balance: "+getBalance();
    }

}

class BankOfAmerica{
    public static void main(String[] args) {

        BankAccount Solmaz = new BankAccount("Solmaz", "Chiragova");

        System.out.println( Solmaz.getAccountHolder());
        Solmaz.setBalance(1200);
        System.out.println( Solmaz.getBalance());
        Solmaz.availableBalance();
        Solmaz.depositing(200);
        Solmaz.withdrawing(100);
        System.out.println(Solmaz);
        System.out.println(Solmaz.bankName);
        Solmaz.withdrawing(1000);
        System.out.println(Solmaz);
        Solmaz.withdrawing(300);
        System.out.println(Solmaz);
        Solmaz.withdrawing(20);
        System.out.println(Solmaz);

    }
}
































































