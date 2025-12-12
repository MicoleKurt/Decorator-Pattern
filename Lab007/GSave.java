package Lab007;

public class GSave implements BankAccountDecorator {
    private SavingsAccount account;
    
    public GSave(SavingsAccount account) {
        this.account = account;
    }
    
    @Override
    public String showInfo() {
        return account.showInfo();
    }
    
    @Override
    public String showAccountType() {
        return "GSave";
    }
    
    @Override
    public double getInterestRate() {
        return 2.5;
    }
    
    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate() / 100);
    }
    
    @Override
    public String showBenefits() {
        return account.showBenefits() + " + GSave Transfer";
    }
}
