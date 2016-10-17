import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JBMICalculator extends JApplet implements ActionListener
{
   JLabel heightLabel = new JLabel("Enter height in inches");
   JLabel weightLabel = new JLabel("Enter weight in pounds");
   JTextField heightField = new JTextField("", 5);
   JTextField weightField = new JTextField("", 5);
   JTextField bmiField = new JTextField("", 15);
   JButton button = new JButton("Calculate BMI");
   Container con = getContentPane();
   public void init()
   {
      FlowLayout flow = new FlowLayout();
      con.setLayout(flow);

      con.add(heightLabel);
      con.add(heightField);
      con.add(weightLabel);
      con.add(weightField);
      con.add(button);
      button.addActionListener(this);
      heightField.requestFocus();
   }

   public void actionPerformed(ActionEvent e)
   {
      final int BMI_CONST = 703;
      String response;
      response = heightField.getText();
      double height = Double.parseDouble(response);
      response = weightField.getText();
      double weight = Double.parseDouble(response);
      double bmi = weight / (height * height) * BMI_CONST;
      bmiField.setText("BMI is " + bmi);
      con.add(bmiField);
      validate();
   }
}