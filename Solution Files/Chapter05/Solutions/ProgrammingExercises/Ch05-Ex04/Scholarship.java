import javax.swing.*;
public class Scholarship
{
   public static void main (String args[])
   {
      double gpa;
      int extra;
      int service;
      final double GPA_HIGH = 3.8;
      final double GPA_MED = 3.4;
      final double GPA_LOW = 3.0;
      final String CANDIDATE_MSG = "Scholarship candidate";
      final String NOT_MSG = "Not a candidate";
      String entry, message;
      entry = JOptionPane.showInputDialog(null,
         "Enter your grade point average");
      gpa = Double.parseDouble(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter extracurricular activities");
      extra = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter service activities");
      service = Integer.parseInt(entry);
      if(gpa >= GPA_HIGH)
        if(extra >= 1 && service >= 1)
           message = CANDIDATE_MSG;
        else
           message = NOT_MSG;
      else
          if(gpa >= GPA_MED)
             if((extra + service) >= 3)
                 message = CANDIDATE_MSG;
             else
                 message = NOT_MSG;
          else
             if(gpa >= GPA_LOW)
                 if(extra >= 2 && service >= 2)
                    message = CANDIDATE_MSG;
                else
                    message = NOT_MSG;
             else
                message = NOT_MSG;
      JOptionPane.showMessageDialog(null, message);
   }
}
    



