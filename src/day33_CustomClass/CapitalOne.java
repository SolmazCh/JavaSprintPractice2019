package day33_CustomClass;

import com.sun.nio.sctp.AbstractNotificationHandler;
import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Anna = new BankAccount();

        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456789;

        Anna.checkingBalance();
        Anna.deposit(33);
        Anna.checkingBalance();
        Anna.withDraw(13);
        Anna.checkingBalance();


        Anna.withDraw(30);
        Anna.checkingBalance(); // penalty 35$
        Anna.withDraw(1000);  // your balance is not enough for withdrawing more money

        System.out.println("=============================================");
        System.out.println(Anna);

    }
}
