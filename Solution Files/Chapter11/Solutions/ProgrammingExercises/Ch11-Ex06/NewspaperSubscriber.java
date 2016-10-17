// NewspaperSubscriber.java
// Chapter 11, Exercise 6
import javax.swing.*;
public abstract class NewspaperSubscriber
{
   protected String address;
   protected double rate;
   public NewspaperSubscriber() 
   {
      setAddress();
      setRate();
   }
   public boolean equals(NewspaperSubscriber nps)
   {
      boolean result;
      if(address.equals(nps.address))
        result = true;
      else
        result = false;
      return result;
   }
   public String getAddress()
   {
      return address;
   }
   public double getRate()
   {
      return rate;
   }
   public void setAddress()
   {
      address = JOptionPane.showInputDialog(null,
        "Enter address of subscriber");
   }
   public abstract void setRate();
}
