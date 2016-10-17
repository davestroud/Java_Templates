import javax.swing.*;
public class GadgetOrderTaker
{
   public static void main(String[] args)
   {
      String inStr, outStr;
      final int QUIT = 999;
      final int MAX = 4;
      final int MAXQUAN = 100;
      int custNum = 100;
      int item = 0, quantity = 0;
      int itemCount = 0, custCount = 0;
      double pr, total = 0, sh;
      int x;
      String name, address;
      Order[] order = new Order[MAX];
      int[] gadgetOrdered = new int[MAX];
      Gadget[] gadget = new Gadget[MAX];
      gadget[0] = new Gadget(101, "Electric hand warmer", 12.99);
      gadget[1] = new Gadget(124, "Battery operated plant waterer", 7.55);
      gadget[2] = new Gadget(256, "Gerbil trimmer", 9.99);
      gadget[3] = new Gadget(512, "Talking bookmark", 6.89);
      double[] totalForShipping = {25, 50, 999999};
      double[] shCharge = {5.55, 8.55, 11.55};
      String itemList = "";
      for(x = 0; x < MAX; ++x)
         itemList += ("\n" + gadget[x].getItemNum());
      while(custCount < MAX)
      {
         custNum++;
         itemCount = 0;
         total = 0;
         name = JOptionPane.showInputDialog(null, "Enter name");
         address = JOptionPane.showInputDialog(null, "Enter address");
         inStr = JOptionPane.showInputDialog(null,
             "Enter item to order, or " + QUIT + " to quit" +
             "\nItems are:\n" + itemList);
         try
         {
             item = Integer.parseInt(inStr);
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, "In catch " + e.getMessage() + "\nEnding application");
             System.exit(0);
         }
         while (item != QUIT)
         {
             try
             {
                if(itemCount == MAX)
                   throw (new OrderException("You can order only four items!"));
             }
             catch(Exception e)
             {
                JOptionPane.showMessageDialog(null, "In catch " + e.getMessage()+ "\nEnding application");
                System.exit(0);
             }      
             inStr = JOptionPane.showInputDialog(null, "Enter quantity");
             try
             {
                 quantity = Integer.parseInt(inStr);
                 if(quantity > MAXQUAN)
                      throw(new OrderException("No more than " + MAXQUAN + " of an item!"));
             }
             catch(Exception e1)
             {
                JOptionPane.showMessageDialog(null, "In catch " + e1.getMessage()+ "\nEnding application");
                System.exit(0);
             } 
             gadgetOrdered[itemCount] = item;
             boolean found = false;
             for(x = 0; x < MAX; ++x)
             {
                if(item == gadget[x].getItemNum())
                {
                    found = true;
                    pr = gadget[x].getPrice();
                    total += pr * quantity;
                }
             }
             try
             {
                 if(!found)
                    throw(new OrderException("Invalid item number!"));
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, "In catch " + e.getMessage()+ "\nEnding application");
                 System.exit(0);
              } 
              itemCount++;
              inStr = JOptionPane.showInputDialog(null,
                    "Enter item to order, or " + QUIT + " to quit" +
                     "\nItems are:\n" + itemList);
              try
              {
                  item = Integer.parseInt(inStr);
              }
              catch(Exception e)
              {
                 JOptionPane.showMessageDialog(null, "In catch " + e.getMessage() + "\nEnding application");
                 System.exit(0);
              } 
         }
         sh = 0;
         for(x = 0; x < totalForShipping.length; ++x)
         {
              if(total < totalForShipping[x])
              {
                   sh = shCharge[x];
                   x = totalForShipping.length;
              }
         }
            
         order[custCount] = new Order(custNum, name, address, gadgetOrdered, total, sh); 
         custCount++;
      }
      for(x= 0; x < MAX; ++x)
      {
          outStr = "Order #" + order[x].getOrderNum() + "\n" + order[x].getName() + "\n" + 
               order[x].getAddress() + "\n$" + order[x].getTotal() +
               "\nShipping and handling $" + order[x].getShipAndHandle();
          JOptionPane.showMessageDialog(null, outStr);   
      }
      
      System.exit(0);
   }
}
