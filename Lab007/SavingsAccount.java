package Lab007;

public class SavingsAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    
    public SavingsAccount() {
    }
    
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public double getBalance() {
        return balance;
    }
    
   
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Methods
    public String showInfo() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: " + balance;
    }
    
    public String showAccountType() {
        return "Savings Account";
    }
    
    public double getInterestRate() {
        return 1.0;
    }
    
    public double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate() / 100);
    }
    
    public String showBenefits() {
        return "Standard Savings Account";
    }
}