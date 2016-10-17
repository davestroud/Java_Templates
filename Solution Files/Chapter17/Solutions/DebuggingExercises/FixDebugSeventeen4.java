// Computes property tax as 3.25% of property value
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FixDebugSeventeen4 extends JApplet implements ActionListener
{
   JLabel title = new JLabel("Property Tax Calculator");
   JLabel countyName = new JLabel("Opulent County");
   JButton calcButton = new JButton("Compute Tax");
   JLabel prompt = new JLabel("Enter the value of your property");
   JTextField propVal = new JTextField(8);
   JLabel taxBill = new JLabel("Your County Collector");
   Font bigFont = new Font("Helvetica", Font.ITALIC, 16);
   final double RATE = .0325;
   public void init()
   {
      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      title.setFont(bigFont);
      countyName.setFont(bigFont);
      taxBill.setFont(bigFont);
      con.add(title);
      con.add(countyName);
      con.add (prompt);
      con.add (propVal);
      con.add (calcButton);
      calcButton.addActionListener(this);
      con.add(taxBill);
   }

   public void start()
   {
      propVal.setText("");
      propVal.requestFocus();
   }

   public void actionPerformed(ActionEvent e)
   {
      int value = Integer.parseInt(propVal.getText());
      double tax = RATE * value;
      taxBill.setText("Property tax is $" + tax);
   }
}