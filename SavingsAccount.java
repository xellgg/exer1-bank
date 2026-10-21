package exer1_bank;

public class SavingsAccount extends BankAccount {
    public String ownerName;

    public SavingsAccount(String ownerName, double balance, boolean isFrozen) {
        super(balance, isFrozen);
        this.ownerName = ownerName;
    }

    public SavingsAccount(String ownerName) {
        this(ownerName, 0, false); 
        System.out.println("Account owner: " + ownerName + ".");
    }

    public String getOwnerName() {
        return ownerName;
    }
}
