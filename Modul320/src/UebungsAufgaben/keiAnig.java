package UebungsAufgaben;

import java.util.AbstractCollection;
import java.util.Scanner;

public class keiAnig {
    public static void main(String[] args) {
        Account mainaccount = new Account(100);
        System.out.println("Welcome to the account application");
        double amount = 0;
        String command = "";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = sc.nextDouble();
            if (amount != 0) {
                System.out.println("To deposit, press +, to withdraw press -");
                command = sc.next();
                if (command.equals("+")) {
                    mainaccount.deposit(amount);
                } else if (command.equals("-")) {
                    mainaccount.withdraw(amount);
                }
            }
        } while (amount != 0);

        System.out.println("Final balance: " + mainaccount.getBalance());
    }

    public static double deposit(double balance, double amount) {
        return balance + amount;
    }

    public static double withdraw(double balance, double amount) {
        return balance - amount;
    }
}
