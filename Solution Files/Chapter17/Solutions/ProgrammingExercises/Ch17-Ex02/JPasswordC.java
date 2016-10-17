import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPasswordC extends JApplet implements ActionListener
{
   JLabel banner = new JLabel("Enter your password: ");
   JTextField pw = new JTextField("",10);
   JButton button1 = new JButton("ENTER");
   JLabel result = new JLabel("");
   Font bigFont = new Font("TimesRoman",Font.BOLD, 24);
   Container con = getContentPane();
   FlowLayout flow = new FlowLayout();
   String[] words = {"rosebud","redrum","jason","surrender",
     "dorothy"};
   boolean isMatch = false;
   public void init()
   {
      Container con = getContentPane();
      FlowLayout flow = new FlowLayout();
      con.setLayout(flow);
      con.add(banner);
      con.add(pw);
      con.add(button1);
      con.add(result);
      button1.addActionListener(this);
      pw.requestFocus();
   }
   public void actionPerformed(ActionEvent e)
   {

      Object source = e.getSource();
      if (source == button1)
      {
        for (int i = 0; i < 5; i++)
        {
           if( (pw.getText().equalsIgnoreCase(words[i]) ) )
           {
              isMatch = true;
           }
        }
        if(isMatch)
           result.setText("Access Granted");
        else
           result.setText("Access Denied");
      }
   }
}