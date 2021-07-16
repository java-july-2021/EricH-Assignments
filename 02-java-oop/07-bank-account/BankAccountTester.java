public class BankAccountTester{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println(BankAccount.getAccountsCreated());

        account1.deposit(100, "checings");
        account1.deposit(100, "savings");
        
        account1.withdraw(50, "checings");
        account1.withdraw(25, "savings");

        System.out.println(account1.getAccountTotal());

        account1.moneyInAccount();

        account2.deposit(1000, "checings");
        account2.deposit(1000, "savings");
        
        account2.withdraw(900, "checings");
        account2.withdraw(900, "savings");

        System.out.println(account2.getAccountTotal());

        account2.moneyInAccount();
    }
}