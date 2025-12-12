public class AccountDisplay {
    
    public static void displaySavingsAccount() {
        SavingsAccount account = new SavingsAccount();
        account.setAccountNumber(1234);
        account.setAccountName("Juan Dela Cruz");
        account.setBalance(10000.0);
        
        System.out.println("\n========== Standard Savings Account ==========");
        System.out.println(account.showInfo());
        System.out.println("Account type: " + account.showAccountType());
        System.out.println("Interest rate: " + account.getInterestRate() + "%");
        System.out.println("New balance: " + account.computeBalanceWithInterest());
        System.out.println("Benefits: " + account.showBenefits());
        System.out.println("============================================");
    }
    
    public static void displayGSaveAccount() {
        SavingsAccount account = new SavingsAccount();
        account.setAccountNumber(1234);
        account.setAccountName("Juan Dela Cruz");
        account.setBalance(10000.0);
        
        GSave gSave = new GSave(account);
        
        System.out.println("\n========== GSave Account ==========");
        System.out.println(gSave.showInfo());
        System.out.println("Account type: " + gSave.showAccountType());
        System.out.println("Interest rate: " + gSave.getInterestRate() + "%");
        System.out.println("New balance: " + gSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + gSave.showBenefits());
        System.out.println("===================================");
    }
    
    public static void displayUpSaveAccount() {
        SavingsAccount account = new SavingsAccount();
        account.setAccountNumber(1234);
        account.setAccountName("Juan Dela Cruz");
        account.setBalance(10000.0);
        
        UpSave upSave = new UpSave(account);
        
        System.out.println("\n========== UpSave Account ==========");
        System.out.println(upSave.showInfo());
        System.out.println("Account type: " + upSave.showAccountType());
        System.out.println("Interest rate: " + upSave.getInterestRate() + "%");
        System.out.println("New balance: " + upSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + upSave.showBenefits());
        System.out.println("====================================");
    }
}
