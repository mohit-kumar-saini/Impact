class Bank_Account 
{
    String accountHolder;
    double balance;

    public Bank_Account(String accountHolder, double balance) 
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else 
        {
            System.out.println("Insufficient balance.");
        }
    }

    public void showBalance() 
    {
        System.out.println("Current Balance: " + balance);
    }
}
class Savings_Account extends Bank_Account 
{

    public Savings_Account(String accountHolder, double balance) 
    {
        super(accountHolder, balance);
    }
    public void withdraw(double amount) 
    {
        if (balance - amount < 100) 
        {
            System.out.println("Withdrawal denied! Balance must not go below 100.");
        } else 
        {
            super.withdraw(amount); 
        }
    }
}
public class Override_bank_account
{
    public static void main(String[] args) 
    {
        Savings_Account sa = new Savings_Account("Mohit", 500);
        sa.deposit(200);         
        sa.withdraw(550);     
        sa.withdraw(400);       
        sa.showBalance();        
    }
}
