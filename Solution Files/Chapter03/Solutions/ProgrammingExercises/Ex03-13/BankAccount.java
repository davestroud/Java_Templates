// BankAccount.java
// Chapter 3,Exercise 13
// creates a class to store info about a patient
class BankAccount
{
   private String accountNumber;
   private String name;
   private double balance;
   final static double FEE = 4.00;
   public BankAccount()
   {
      accountNumber = "99999";
      name = "XXXXX";
      balance = 0;
   }

   public void setAccountNumber(String acct)
   {
      accountNumber = acct;
   }

   public void setName(String customer)
   {
      name = customer;
   }

   public void setBalance(double bal)
   {
      balance = bal;
   }

   public String getAccountNumber()
   {
      return accountNumber;
   }

   public String getName()
   {
      return name;
   }

   public double getBalance()
   {
      return balance;
   }

   public void deductMonthlyFee()
   {
      balance = balance - FEE;
   }

   public static void explainAccountPolicy()
   {
      System.out.println("A service fee of $" + FEE + " is deducted from each account once a month");
   }

}
