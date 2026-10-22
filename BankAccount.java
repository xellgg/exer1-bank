package exer1_bank;

public class BankAccount {
    private double balance;
    private boolean isFrozen;

    public BankAccount(double balance, boolean isFrozen) {
        this.balance = balance;
        this.isFrozen = isFrozen;
    }

    public void deposit(double amount) {
    if (isFrozen) {
        System.out.println("Account is FROZEN. Unable to transact.");
        return;
    }
    if (amount <= 0) {
        System.out.println("Amount deposited: " + String.format("%.2f", amount));
        System.out.println("Invalid amount. Must be greater than 0");
        return;
    }
    balance += amount;
    System.out.println("Amount deposited: " + String.format("%.2f", amount));
    System.out.println("Current balance: " + String.format("%.2f", balance));
}

public void withdraw(double amount) {
    if (isFrozen) {
        System.out.println("Account is FROZEN. Unable to transact.");
        return;
    }
    System.out.println("Amount withdrawn: " + String.format("%.2f", amount));
    if (amount <= 0) {
        System.out.println("Invalid amount. Must be greater than 0");
        return;
    }
    if (amount > balance) {
        System.out.println("Insufficient balance.");
        System.out.println("Current balance: " + String.format("%.2f", balance));
    } else {
        balance -= amount;
        System.out.println("Current balance: " + String.format("%.2f", balance));
    }
}

    public double getBalance() {
        return balance;
    }

    public void freezeAccount() {
        isFrozen = true;
    }

    public void unfreezeAccount() {
        isFrozen = false;
    }

    public boolean isFrozen() {
        return isFrozen;
    }
}
