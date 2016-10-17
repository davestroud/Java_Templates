import javax.swing.*;
public class UseCarRental
{
   public static void main(String args[])
   {
      String inStr;
      String name;
      String zip;
      char type;
      int days;
      name = JOptionPane.showInputDialog(null, "Enter name"); 
      zip = JOptionPane.showInputDialog(null, "Enter zip code"); 
      inStr = JOptionPane.showInputDialog(null, "Enter type of car" +
        "\n e - econony\nm - midsize\nf - full size\nl - luxury"); 
      type = inStr.charAt(0);
      inStr = JOptionPane.showInputDialog(null, "Enter days to rent"); 
      days =  Integer.parseInt(inStr);  
      if(type == 'l')
      {
         LuxuryCarRental car = new LuxuryCarRental(name, zip, type, days);
         car.display();
      }
      else
      {
         CarRental car = new CarRental(name, zip, type, days);
         car.display();
      }
   }
}
