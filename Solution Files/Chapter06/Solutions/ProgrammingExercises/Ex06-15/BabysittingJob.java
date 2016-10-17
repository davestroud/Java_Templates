import javax.swing.*;
public class BabysittingJob
{
   private String job;
   private int babysitterCode;
   private String name;
   private int children;
   private int hours;
   private double fee;
   final double CINDY_FEE = 7;
   final double FIRST_HR_FEE = 9;
   final double SEC_HR_FEE = 4;
   public BabysittingJob(String num, int code, int kids, int hours)
   {
      job = num;
      babysitterCode = code;
      children = kids;
      this.hours = hours;
      if(code == 1)
      {
         name = "Cindy";
         fee = CINDY_FEE * kids * hours;
      }
      else
      {
         fee = (FIRST_HR_FEE + ((kids - 1) * SEC_HR_FEE)) * hours;
         if(code == 2)
            name = "Greg";
         else
            name = "Marcia";
      }
   }        
   public void display()            
   {
     JOptionPane.showMessageDialog(null, "BabysittingJob #" +
         job + "\nBabysitter #" + babysitterCode + " " + name +
         "\nChildren: " + children + " Hours: " + hours +
         "\nFee: $" + fee);
   }
}   