import java.util.*;

class BankAccount {
    double balance;
    List<String> transactionHistory = new ArrayList<>();

    public void setbalance(double b) {
        balance = b;
        transactionHistory.add("Account created with Rs." + b);
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited Rs." + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrew Rs." + amount);
        } else {
            transactionHistory.add("Failed Withdrawal of Rs." + amount + " (Insufficient Balance)");
            System.out.println("Insufficient balance");
        }
    }

    public void printTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactionHistory) {
            System.out.println("- " + t);
        }
    }
}

public class Banktask5 {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        BankAccount obj2 = new BankAccount();
        BankAccount obj3 = new BankAccount();
        BankAccount obj4 = new BankAccount();
        BankAccount obj5 = new BankAccount();

        obj1.setbalance(10000);
        obj2.setbalance(20000);
        obj3.setbalance(30000);
        obj4.setbalance(40000);
        obj5.setbalance(50000);

        obj1.deposit(1000);
        obj2.deposit(2000);
        obj3.deposit(3000);
        obj4.deposit(4000);
        obj5.deposit(5000);

        obj1.withdraw(1000);
        obj2.withdraw(2000);
        obj3.withdraw(3000);
        obj4.withdraw(4000);
        obj5.withdraw(5000);

        BankAccount[] accounts = {obj1, obj2, obj3, obj4, obj5};
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\nBalance of employee " + (i + 1) + ": Rs." + accounts[i].getbalance());
            accounts[i].printTransactions();
        }
    }
}
