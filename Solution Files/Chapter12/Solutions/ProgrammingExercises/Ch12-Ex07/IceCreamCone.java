import javax.swing.*;
public class IceCreamCone
{
   String flavor;
   int scoops;
   final int MAX = 3;
   public IceCreamCone() throws IceCreamConeException
   {
      setFlavor();
      setScoops();
   } 
   void setFlavor()
   {
      flavor = JOptionPane.showInputDialog(null,"Enter flavor");
   }    
   void setScoops() throws IceCreamConeException
   {
       String inString = new String();
       inString = JOptionPane.showInputDialog(null, "Enter number of scoops");
       scoops = Integer.parseInt(inString);
       if(scoops > MAX)
          throw(new IceCreamConeException(flavor + " " +
             scoops + " scoops"));
   }
}