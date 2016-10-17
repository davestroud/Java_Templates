// TestBankAccount.java
import java.util.Scanner;
class TestBankAccount
{
   public static void main (String args[])
   {
     BankAccount account1;
     BankAccount account2;
     BankAccount account3;
     BankAccount account4 = new BankAccount();
     account1 = getData();
     account2 = getData(); 
     account3 = getData();

     showValues(account1);
     showValues(account2);
     showValues(account3);
     showValues(account4);
   }
   public static void showValues(BankAccount b)
   {
      System.out.println("\n\nYour BankAccount results:" +
         "\nAcct # : " + b.getAccountNumber() +
         "\nName   : " + b.getName() +
         "\nBalance: " + b.getBalance());
      b.deductMonthlyFee();
      System.out.println("After deduction new balance is $" + b.getBalance());
      b.explainAccountPolicy();
   }
   public static BankAccount getData()
   {
       String acct;
       String name;
       double bal;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter account number >> ");
       acct = input.nextLine();
       System.out.print("Enter name >> ");
       name = input.nextLine();
       System.out.print("Enter balance >> ");
       bal = input.nextDouble();
       input.nextLine();
       BankAccount temp = new BankAccount();
       temp.setAccountNumber(acct);
       temp.setName(name);
       temp.setBalance(bal);
       return temp;
   }
}


