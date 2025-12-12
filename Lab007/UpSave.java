
package Lab007;

public class UpSave implements BankAccountDecorator {
    private SavingsAccount account;
    
    public UpSave(SavingsAccount account) {
        this.account = account;
    }
    
    @Override
    public String showInfo() {
        return account.showInfo();
    }
    
    @Override
    public String showAccountType() {
        return "UpSave";
    }
    
    @Override
    public double getInterestRate() {
        return 4.0;
    }
    
    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate() / 100);
    }
    
    @Override
    public String showBenefits() {
        return account.showBenefits() + " + With Insurance";
    }
}