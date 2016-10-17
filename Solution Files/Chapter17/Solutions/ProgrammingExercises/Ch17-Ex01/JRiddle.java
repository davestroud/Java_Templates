import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRiddle extends JApplet implements ActionListener
{
   JLabel riddle = new JLabel("What can you keep after giving it to someone else?");
   JButton button1 = new JButton("See answer");
   JLabel answer = new JLabel("");
   Font bigFont = new Font("TimesRoman",Font.BOLD, 24);

   public void init()
   {
      Container con = getContentPane();
      FlowLayout flow = new FlowLayout();
      con.setLayout(flow);
      con.add(riddle);
      con.add(button1);
      con.add(answer);
      button1.addActionListener(this);
   }

  public void actionPerformed(ActionEvent e)
  {
      Object source = e.getSource();
      if (source == button1)
      {
          answer.setFont(bigFont);
          answer.setText("Your word.");
      }
  }
}