package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder="Saban";
        obj.showBalance();

        System.out.println(obj);

        obj.deposit(25000);
        System.out.println(obj);
        obj.showBalance();

        obj.withDraw(10000);
        obj.showBalance();


        System.out.println("=================================================================");

        SavingAccount saving = new SavingAccount();
        saving.accountHolder="Ellin";
        saving.deposit(3000);
        System.out.println(saving.interestRate);

        System.out.println(saving);











    }
}
