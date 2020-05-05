package day33_CustomClass;
/*
 create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
 */
public class BankAccount {

    long accountNumber;
    String accountHolder;
    double balance;

    public void checkingBalance(){
        System.out.println("Your current balance is "+balance);
    }


    public void withDraw(double amount){

        System.out.println("Withdrawing $"+amount);
        if(balance<amount){
        balance -=amount;
        balance-=35;
        }else{
            balance -=amount;
        }





    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance+=amount;
    }

    public String toString(){
        String result ="Account Holder: "+accountHolder+"\nAccount number: "+accountNumber+"\nAvailable Balance: "+balance;
        return result;
    }




}
