import javax.swing.*;
public class GadgetOrderTaker2
{
   public static final int QUIT = 999;
   public static final int MAX = 4;
   public static final int MAXQUAN = 100;
   public static void main(String[] args)
   {
      String inStr, outStr;
      int custNum = 100;
      int item = 0, quantity = 0;
      int itemCount = 0, custCount = 0;
      double pr, total = 0, sh = 0;
      int x;
      String name, address;
      Order[] order = new Order[MAX];
      int[] gadgetOrdered = new int[MAX];
      Gadget[] gadget = new Gadget[MAX];
      
      double[] totalForShipping = {25, 50, 999999};
      double[] shCharge = {5.55, 8.55, 11.55};
      String itemList = "";
      boolean itemOK = false;
      gadget[0] = new Gadget(101, "Electric hand warmer", 12.99);
      gadget[1] = new Gadget(124, "Battery operated plant waterer", 7.55);
      gadget[2] = new Gadget(256, "Gerbil trimmer", 9.99);
      gadget[3] = new Gadget(512, "Talking bookmark", 6.89);
      for(x = 0; x < gadget.length; ++x)
        itemList += ("\n" + gadget[x].getItemNum());
      while(custCount < MAX)
      {
         custNum++;
         itemCount = 0;
         total = 0;
         name = JOptionPane.showInputDialog(null, "Enter name");
         address = JOptionPane.showInputDialog(null, "Enter address");
         item = getItemNumber(name, itemList);
         while(item != QUIT)
         {
             try
             {
                 boolean found = false;
                 for(x = 0; x < MAX; ++x)
                    if(item == gadget[x].getItemNum())
                    {   
                        found = true;
                        pr = gadget[x].getPrice();
                        total += pr * quantity;
                    }
                 if(!found)
                 {
                    throw(new OrderException(item + " is an invalid item number!"));
                 }
      
                 inStr = JOptionPane.showInputDialog(null, "Enter quantity for item " + item);
                 quantity = Integer.parseInt(inStr);
                 if(quantity > MAXQUAN)
                     throw(new OrderException("No more than " + MAXQUAN + " of an item!"));
                 gadgetOrdered[itemCount] = item;
                 ++itemCount;
                 if(itemCount == MAX)
                 {
                      JOptionPane.showMessageDialog(null, "Thank you. That is " + MAX + " items.");
                      item = QUIT;
                 }
          
             }
             catch(Exception e)
             {
                  JOptionPane.showMessageDialog(null, e.getMessage() + "\nEnter new item");
             }
             if(item != QUIT)
                item = getItemNumber(name, itemList);
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
  
      for (x = 0; x < MAX; ++x)
      {
        outStr = "Order #" + order[x].getOrderNum() + "\n" + order[x].getName() + "\n" + 
          order[x].getAddress() + "\n$" + order[x].getTotal() +
          "\nShipping and handling $" + order[x].getShipAndHandle();
       JOptionPane.showMessageDialog(null, outStr);  
      }
  }

  public static int getItemNumber(String name, String itemList)
  {
      int item = 0;
      String inStr;
      boolean itemOK = false;
      while(!itemOK)
      {
         itemOK = true;
         try
         {
             inStr = JOptionPane.showInputDialog(null,
               "Hello " + name + "\nEnter item to order, or " + QUIT + " to quit" +
               "\nItems are:\n" + itemList);
             item = Integer.parseInt(inStr);
         }
         catch(Exception e)
         {
             itemOK = false;
         }
      }
      return item;
   }
}
