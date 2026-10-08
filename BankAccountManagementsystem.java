import java.util.Scanner;

class BankAccount 
{
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accNum, String accHolderName, double balance) 
    {
        this.accountNumber = accNum;
        this.accountHolderName = accHolderName;
        this.balance = balance;
    }

    void deposit(double amount) 
    {
        balance = balance + amount;
    }

    void withdraw(double amount) 
    {
         if (balance >= amount) 
        {
            balance = balance - amount;
        }
         else
        {
            System.out.println("Insufficient balance");
        }
    }

    double checkBalance() 
    {
        return balance;
    }

    void displayAccount() 
    {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class  BankAccountManagementsystem
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = input.nextInt();

        input.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount
           (accountNumber,accountHolderName,balance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = input.nextDouble();
        account.withdraw(withdrawalAmount);

        account.displayAccount();

        input.close();
    }
}