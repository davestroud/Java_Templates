import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDouble extends JApplet implements ActionListener
{
   JLabel banner = new JLabel("Enter an integer: ");
   JTextField number = new JTextField("", 5);
   JButton button1 = new JButton("Press first");
   JButton button2 = new JButton("Double Me");
   FlowLayout flow = new FlowLayout();
   Container con = getContentPane();
   double ans = 0;
   String response;
   public void init()
   {
      con.setLayout(flow);
      con.add(button1);
      button1.addActionListener(this);
      button1.requestFocus();
   }
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if (source == button1)
      {
         con.add(banner);
         con.add(number);
         con.add(button2);
         button2.addActionListener(this);
	 button2.requestFocus();
      }
      else
      { 
         String a = number.getText();
         ans =  Double.parseDouble(a);
	 ans = ans * 2;
         number.setText("" + ans);
      }
      validate();
   }
}