import java.util.Random;

public class BankAccount{
    private String accountNumber;
    private double checkingsBalance; 
    private double savingsBalance;

    private static int accountsCreated = 0;
    private static double moneyInAccount = 0;

    // public int accountsCreated(){
    //     retunr this.
    // }

    public BankAccount() {
        this.accountNumber = this.RandomNumber();
        this.checkingsBalance = 0;
        this.savingsBalance = 0;
        accountsCreated ++;
    }


    private String RandomNumber(){
        String accountNumber = "";
        Random r = new Random();
        for (int x = 0; x < 10; x++){
            accountNumber = accountNumber.concat(String.valueOf(r.nextInt(10)));
        }
        // System.out.println(accountNumber);
        return accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount, String account){
        if (account.equals ("checings")){
            this.setCheckingsBalance(this.getCheckingsBalance() + amount);
        }
            
        else if (account.equals ("savings")){
            this.setSavingsBalance(this.getSavingsBalance() + amount);
        }
        BankAccount.moneyInAccount += amount;
    }

    public void withdraw(double amount, String account){
        if (account.equals ("checings")){
            if (this.getCheckingsBalance() - amount < 0){
                System.out.println("Insuficient Funds in checkings account");
            }
            else {
                this.checkingsBalance -= amount;
                BankAccount.moneyInAccount -= amount;
            }
                
        }
        else if (account.equals ("savings")){
            if (this.getSavingsBalance() - amount < 0){
                System.out.println("Insuficient Funds in savings account");
            }
            else {
                this.savingsBalance -= amount;
                BankAccount.moneyInAccount -= amount;
            }
        }
    }

    public double getCheckingsBalance() {
        return checkingsBalance;
    }
    public void setCheckingsBalance(double checkingsBalance) {
        this.checkingsBalance = checkingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccountsCreated() {
        return accountsCreated;
    }
    public static void setAccountsCreated(int accountsCreated) {
        BankAccount.accountsCreated = accountsCreated;
    }
    
    // public void setmoneyInAccount() {
    //     BankAccount.moneyInAccount = moneyInAccount;
    // }
    // public double getmoneyInAccount() {
    //     return moneyInAccount;
    // }

    public String getAccountTotal(){
            return "Your checkings balance is $" + (this.getCheckingsBalance()) + " " + "Your savings balance is $" + (this.getSavingsBalance());
    }

    public double moneyInAccount(){
        System.out.println("Your total balance is $" + this.moneyInAccount);
        return this.moneyInAccount;
    }
}






