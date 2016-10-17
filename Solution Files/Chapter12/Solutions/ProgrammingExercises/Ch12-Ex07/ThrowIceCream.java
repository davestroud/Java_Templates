import javax.swing.*;
public class ThrowIceCream
{
   public static void main(String[] args) throws IceCreamConeException
   {
      final int MAX = 3;
      int x;
      for(x = 0; x < MAX; ++x)
      {
         try
         {
            IceCreamCone ic = new IceCreamCone();
         }
         catch(IceCreamConeException error)
         {
           JOptionPane.showMessageDialog(null,"Ice Cream Cone Error: " +  
              error.getMessage());
         }
      }
   }
}