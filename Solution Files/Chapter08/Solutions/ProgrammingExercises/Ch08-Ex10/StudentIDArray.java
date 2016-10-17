import javax.swing.*;
class StudentIDArray
{
   public static void main(String[] args)
   {
       int[] idNums = {1412, 1536, 1618, 1732, 1834,
            2129, 2287, 2367, 2381, 2410};
       String[] names =  {"Nina", "Dominique", "DJ",
         "Paul", "Johnny", "Adrienne", "Marilyn",
          "Lawrence", "Samantha", "Bridget"};
       double gpa[] = {  4.0, 3.9, 3.8, 3.7, 3.6,
           2.3, 2.6, 3.1, 3.5, 2.0};

      String entry,  message ="Enter an ID number";
      int num, x;
      boolean isFound = false;
      while(!isFound)
      {
         entry = JOptionPane.showInputDialog(null, message);
         num = Integer.parseInt(entry);
         for(x = 0; x < idNums.length; ++ x)
            if(num == idNums[x])
            {
             isFound = true;
             JOptionPane.showMessageDialog(null,
                "ID#"+ num + "   " + names[x] +
                "  GPA is " +  gpa[x]);
             x = idNums.length;
            }
         if(!isFound)
            message = "Sorry - no student with ID#" +
               entry +"\n" + message;
      }
   }
}
   