import javax.swing.*;
class Schedule
{
   public static void main(String[] args)
   {
      String[][] courses = new String[4][2]; 
      courses[0][0] = "CIS 110";
      courses[0][1] = "Th 3:30";
      courses[1][0] = "ENG 101";
      courses[1][1] = "Mon 1:00";
      courses[2][0] = "HIS 210";
      courses[2][1] = "Tu 10:00";
      courses[3][0] = "CIS 210";
      courses[3][1] = "Mon 2:30";

      String entry,  message ="Enter a course";
      int num, x;
      boolean isFound = false;
      while (!isFound)
      {
         entry = JOptionPane.showInputDialog(null, message);
         for(x = 0; x < courses.length; ++ x)
            if(entry.equals(courses[x][0]))
            {
             isFound = true;
             JOptionPane.showMessageDialog(null,
                "Course " + entry + " meets " + courses[x][1]);
             x = courses.length;
            }
         if(!isFound)
            JOptionPane.showMessageDialog(null, "Sorry - no such course");
      }
   }
}
   