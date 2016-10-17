import javax.swing.*;
public class IceCreamCone2
{
   String flavor;
   int scoops;
   final int MAX = 3;
   String[] flavors = {"Chocolate", "Strawberry", "Vanilla", "Butter pecan"}; 
   public IceCreamCone2() throws IceCreamConeException
   {
      setFlavor();
      setScoops();
   } 
   void setFlavor() throws IceCreamConeException
   {
      boolean found = false;
      flavor = JOptionPane.showInputDialog(null,"Enter flavor");
      for(int x = 0; x < flavors.length; ++x)
        if(flavor.equals(flavors[x]))
           found = true;
      if(!found)
         throw(new IceCreamConeException(flavor +
             " " + scoops + " scoops"));
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