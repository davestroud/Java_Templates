import javax.swing.*;
public class LuxuryCarRental extends CarRental
{
   double driverFee;
   public LuxuryCarRental(String name, String zip, char size, int len)
   {
      super(name, zip, size, len);
      String inStr;
      final double LUX = 79.99;
      rate = LUX;
      final double DRIVERFEE = 200;
      total = len * rate;
      length =  len;
      inStr =JOptionPane.showInputDialog(null,
         "Do you want a chauffeur? Y or N");
      if(inStr.equals("Y") || inStr.equals("y"))
      {
         driverFee = DRIVERFEE * length;
         total += driverFee;
      } 
      else
         driverFee = 0;
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null, "Luxury car for " +
         name + " From zip code " + zip +
         "\nType = " + type + "\nDaily fee = " + rate +
         "\nDays = " + length + "\nChauffeur @ $200/day = " +
         driverFee + "\n***Total rental is " + total);
   }
}
