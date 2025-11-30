package oop_projects;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Create accounts
        BankAccount acc1 = new SavingsAccount("A1", 1000);
        BankAccount acc2 = new CheckingAccount("B1", 200);
        BankAccount acc3 = new SavingsAccount("C1", 1500);

        // Add them to the bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        // Test highest balance
        bank.findHighestBalance();  // Should show C1 = 1500

        // Test deposit
        acc1.deposit(500);
        System.out.println("A1 new balance = " + acc1.balance);  // 1500

        // Test withdraw (success)
        acc2.withdraw(100);  // allowed
        System.out.println("B1 new balance = " + acc2.balance);  // 100

        // Test withdraw (fails)
        acc2.withdraw(700);  // Not enough (checking has overdraft 500)
        System.out.println("B1 balance after failed withdraw = " + acc2.balance);

        // Test transfer (success)
        bank.transfer("C1", "A1", 200);
        System.out.println("C1 balance after transfer = " + acc3.balance);
        System.out.println("A1 balance after receiving = " + acc1.balance);

        // Test transfer (fail)
        bank.transfer("B1", "A1", 1000);  // should not happen
    }
}
