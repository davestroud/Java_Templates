// Create an application that declares a Purchase object and prompts the user
// for purchase details. When you prompt for an invoice number, do not let
// the user proceed until a number between 1,000 and 8,000 has been entered.
// When you prompt for a sale amount, do not proceed until the user has
// entered a nonnegative value. 
import javax.swing.*;
public class CreatePurchase
{
   public static void main(String[] args)
   {
      Purchase purch = new Purchase();
      int num;
      double amount;
      String entry;
      final int LOW = 1000, HIGH = 8000;
      entry = JOptionPane.showInputDialog(null, "Enter invoice number");
      num = Integer.parseInt(entry);
      while(num <= LOW || num >= HIGH)
      {
         entry = JOptionPane.showInputDialog(null, "Invoice number must be between " +
            LOW + " and " + HIGH + "\nEnter invoice number");
         num = Integer.parseInt(entry);
      }
   
      entry = JOptionPane.showInputDialog(null, "Enter sale amount");
      amount = Double.parseDouble(entry);
      while(amount < 0)
      {
         entry = JOptionPane.showInputDialog(null, "Enter sale amount");
         amount = Double.parseDouble(entry);
      }
      purch.setInvoiceNumber(num);
      purch.setSaleAmount(amount);
      purch.display();
   }
}