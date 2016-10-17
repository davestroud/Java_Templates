public class Invoice
{
   int invoiceNumber;
   double balance;
   int month;
   int day;
   int year;
   final int MININVOICE = 1000;
   final int MAXMO = 12;
   final int MAXDAY = 31;
   final int MINYEAR = 2011;
   final int MAXYEAR = 2017;
   public Invoice(int num, double bal, int mo, int da, int yr)
   {
      if(num < MININVOICE)
         invoiceNumber = 0;
      else
         invoiceNumber = num;
      balance = bal;
      if(mo < 1 || mo > MAXMO)
         month = 0;
      else
         month = mo;
      if(da < 1 || da > MAXDAY)
         day = 0;
      else
         day = da;
      if(yr < MINYEAR || yr > MAXYEAR)
         year = 0;
      else
         year = yr;
   }
   public void show()
   {
      System.out.println("Invoice #" + invoiceNumber + "   $" +
         balance + "  Due: " + month + "/" + day + "/" + year);
   }
}