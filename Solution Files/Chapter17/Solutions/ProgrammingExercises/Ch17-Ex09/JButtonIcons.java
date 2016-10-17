import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JButtonIcons extends JApplet implements ActionListener
{
   ImageIcon icon1 = new ImageIcon("right.jpg");
   ImageIcon icon2 = new ImageIcon("left.jpg" );
   ImageIcon icon3 = new ImageIcon("up.jpg" );
   ImageIcon icon4 = new ImageIcon("down.jpg" );

   JButton iconButton1 = new JButton(icon1);
   JButton iconButton2 = new JButton(icon2);
   JButton iconButton3 = new JButton(icon3);
   JButton iconButton4 = new JButton(icon4);

   FlowLayout flow = new FlowLayout();

   public void init()
   {
      Container con = getContentPane();
      con.setLayout(flow);
      con.add(iconButton1);
      con.add(iconButton2);
      con.add(iconButton3);
      con.add(iconButton4);
      iconButton1.addActionListener(this);
      iconButton2.addActionListener(this);
      iconButton3.addActionListener(this);
      iconButton4.addActionListener(this);
   }

   public void actionPerformed(ActionEvent thisEvent)
   {
      Graphics gr = getGraphics();
      Object source = thisEvent.getSource();
      if(source == iconButton1)
  	    gr.drawString("Looking right", 50, 200);
      else if(source == iconButton2)
        gr.drawString("Looking left", 90, 220);
      else if(source == iconButton3)
        gr.drawString("Looking up", 130, 240);
      if(source == iconButton4)
        gr.drawString("Looking down", 170, 260);
   }

}