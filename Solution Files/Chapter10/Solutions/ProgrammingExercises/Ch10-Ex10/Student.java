import javax.swing.*;
public class Student extends Person
{
   private String major;
   private double gpa;
   public void setData()
   {
      String temp;
      super.setData();
      major = JOptionPane.showInputDialog(null,
         "Please enter student's major");
      temp = JOptionPane.showInputDialog(null,
         "Please enter grade point average");
      gpa = Double.parseDouble(temp);
   }
   public void display()
   {
        super.display();
        System.out.println("Major: " + major + "  GPA: " + gpa);
   }
}
