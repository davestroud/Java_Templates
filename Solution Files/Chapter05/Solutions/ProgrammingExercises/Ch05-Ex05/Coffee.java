import javax.swing.*;
public class Coffee
{
  public static void main (String args[]) 
  {
     int choice;
     String entry;
     double total = 0;
     double price;
     choice = getMenuSelection();
     if (choice != 0)
     {
         price = getPrice(choice);
         total = total + price;
         choice = getMenuSelection();
         if(choice != 0)
         {
            price = getPrice(choice);
            total = total + price;
            choice = getMenuSelection();
            if(choice != 0)
            {
              price = getPrice(choice);
              total = total + price;
            }
        }
     }
     JOptionPane.showMessageDialog(null,
       "Your total order comes to $" + total);
  }
  public static int getMenuSelection()
  {
     int choice;
     String entry;
     entry = JOptionPane.showInputDialog(null, 
       "(1)   American      1.99\n" +
       "(2)   Espresso      2.50\n" +
       "(3)   Latte         2.15\n" +
       "Make selection. Press 0 to quit.");
    choice = Integer.parseInt(entry);
    return choice;
  }
  public static double getPrice(int choice)
  {
     final double PRICE1 = 1.99;
     final double PRICE2 = 2.50;
     final double PRICE3 = 2.15;
     double price;
     if(choice == 1)
       price = PRICE1;
     else
       if(choice == 2)
          price = PRICE2;
       else
          price = PRICE3;
     return price;
  }
}


