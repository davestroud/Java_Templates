import javax.swing.*;
public class CarRental
{
   protected String name;
   protected String zip;
   protected int length;
   protected double rate;
   protected char type;
   protected double total;

   public CarRental(String name, String zip, char size, int len)
   {
      final double ECON = 29.99;
      final double MID = 38.99;
      final double FULL = 43.50;
      type = size;
      this.name = name;
      this.zip = zip;
      length = len;
      if(type=='e')
        rate = ECON;
      else
         if(type=='m')
            rate = MID;
         else
            rate = FULL;
      total = rate * length;
   }

   public void display()
   {
      JOptionPane.showMessageDialog(null, "Car for " +
        name + " From zip code " + zip +
        "\nType = " + type + "\nDaily fee = " + rate +
        "\nDays = " + length + "\n***Total rental is " + total);
     
   }
}
