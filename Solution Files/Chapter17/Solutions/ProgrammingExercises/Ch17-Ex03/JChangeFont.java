import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JChangeFont extends JApplet implements ActionListener
{
   JLabel banner = new JLabel("Your Name");
   int fontSize = 18;
   Font theFont = new Font("TimesRoman",Font.BOLD, fontSize);
   JButton button1 = new JButton("Press");
   Container con = getContentPane();
   FlowLayout flow = new FlowLayout();

   public void init()
   {
      Container con = getContentPane();
      FlowLayout flow = new FlowLayout();
      con.setLayout(flow);
      banner.setFont(theFont);
      con.add(banner);
      con.add(button1);
      button1.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if (source == button1)
      {
         Font newFont = new Font("Helvetica", Font.ITALIC, fontSize + 10);
         banner.setFont(newFont);
      }
   }
}