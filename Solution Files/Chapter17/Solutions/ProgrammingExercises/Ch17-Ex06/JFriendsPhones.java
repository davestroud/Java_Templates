import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFriendsPhones extends JApplet implements ActionListener
{
   JLabel banner = new JLabel("Enter a name");
   JLabel banner2 = new JLabel("       Enter a phone number");
   JTextField nameField = new JTextField("", 10);
   JTextField phoneField = new JTextField("", 10);
   JButton button1 = new JButton("Find Phone Number");
   JButton button2 = new JButton("Find Name");
   FlowLayout flow = new FlowLayout();
   Container con = getContentPane();
   Label result = new Label("");
   Font bigFont = new Font("TimesRoman",Font.BOLD, 16);
   int x;
   String[] friends = {"Ann", "Betsy", "Charlie", "Dave",
        "Emma", "Fred", "Ida", "Jenn"};
   String[] phones = {"213-4567", "857-3482",
        "888-8888", "777-7777", "903-8712", "982-8787",
        "435-7485", "622-5900"};
   public void init()
   {
      con.setLayout(flow);
      con.add(banner);
      con.add(nameField);
      con.add(button1);

      con.add(banner2);
      con.add(phoneField);
      con.add(button2);

      button1.addActionListener(this);
      button2.addActionListener(this);
      nameField.requestFocus();
   }

   public void actionPerformed(ActionEvent e)
   {
      int i = 0;

      result.setFont(bigFont);
      boolean match = false;
      Object source = e.getSource();
      if (source == button1)
      {       
         phoneField.setText("");
         match = false;
         for(i = 0; i < friends.length; i++)
         {
            if(nameField.getText().equalsIgnoreCase(friends[i]))
            {
               match = true;
               x = i;
            }
         }

      }
      else
      {
         if(source == button2)
         {
            nameField.setText("");
            match = false;
            for(i = 0; i < friends.length; i++)
            {
               if(phoneField.getText().equalsIgnoreCase(phones[i]))
               {
                  match = true;
                  x = i;
               }
            }
         }
      }
      if(match)
         result.setText("Name: " + friends[x] +
            "    Phone: " + phones[x]);
      else
            result.setText("No Match");
      con.add(result);
      invalidate();
      validate();
   } //end method
} //end class