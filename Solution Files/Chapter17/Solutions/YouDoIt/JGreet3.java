import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JGreet3 extends JApplet implements ActionListener
{
   Container con = getContentPane();
   JLabel greeting = new JLabel("Greetings!");
   Font bigFont = new Font("Times Roman", Font.ITALIC, 24);
   JLabel firstLabel = new JLabel("Please enter your first name:");
   JLabel lastLabel = new JLabel("Please enter your last name:");
   JTextField firstField = new JTextField("", 10);
   JTextField lastField = new JTextField("", 10);
   JButton viewButton = new JButton("View Greeting"); 
   FlowLayout flow = new FlowLayout();
   public void init()
   {
      greeting.setFont(bigFont);
      con.add(greeting);
      con.setLayout(flow);
      con.add(firstLabel);
      con.add(firstField);
      con.add(lastLabel);
      con.add(lastField);
      con.add(viewButton);
      viewButton.addActionListener(this);
      firstField.requestFocus();
   }
   public void actionPerformed(ActionEvent thisEvent)
   {
      String firstName = firstField.getText();
      String lastName = lastField.getText();
      greeting.setText("How are you, " + firstName + " " + lastName + "?");
   }
}