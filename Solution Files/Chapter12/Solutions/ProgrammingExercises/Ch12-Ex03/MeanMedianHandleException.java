import javax.swing.*;
class MeanMedianHandleException
{
   public static void main(String[] args)
   {
      int[] nums = new int[5];
      String entry;
      String list = "You entered: ";
      int a, b;
      int temp;
      int midPos;
      int total = 0;
      double mean;
      String msg = "Enter number ";
      for(a = 0; a < nums.length; ++a)
      {
         entry = JOptionPane.showInputDialog(null,
           msg + (a + 1));
         msg = "Enter number ";
         try
         {
            nums[a] = Integer.parseInt(entry);
            total += nums[a];
            if(a == 0)
               list += nums[a];
            else
               list += ",  " + nums[a];
         }
         catch(Exception e)
         {
            --a;
            msg = "Invalid entry. Enter number again ";
         }
      }
      System.out.println(list);
      int comparisonsToMake = nums.length - 1;
      for(a = 0; a < nums.length - 1; ++a)
      {
         for(b = 0; b < comparisonsToMake; ++b)
         {
            if(nums[b] > nums[b + 1])
            {
               temp = nums[b];
               nums[b] = nums[b + 1];
               nums[b + 1] = temp;
            }
         }
         --comparisonsToMake;
      }
      midPos = nums.length / 2;
      mean = total * 1.0 / nums.length;
      System.out.println("The mean is " + mean +
         " and the median is " + nums[midPos]);

   }
}
   