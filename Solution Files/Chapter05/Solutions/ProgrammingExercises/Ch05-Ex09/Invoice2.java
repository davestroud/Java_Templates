public class Invoice2
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
   final int MAXFEBDAY = 28;
   final int MAXAPRJUNSEPNOVDAY = 30;
   public Invoice2(int num, double bal, int mo, int da, int yr)
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
      if(month == 0)
         day = 0;
      else
          if(da < 1 || da > MAXDAY)
             day = 0;
          else
             if(mo == 2 && da > MAXFEBDAY)
                day = MAXFEBDAY;
             if(mo == 4 || mo == 6 || mo == 9 || mo == 11)
                day = MAXAPRJUNSEPNOVDAY;
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