import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JUpsideDown extends JFrame implements ActionListener
{
   String phrase = new String("There's no place like home");
   int x = 0;
   final int XPOS1 = 100;
   final int XPOS2 = 400;
   final int YPOS1 = 100;
   final int YPOS2 = 100;
   int size = 28;
   JButton aButton = new JButton("Click here");
   Font font = new Font("Helvetica", Font.ITALIC, size);
   Font upsideDownFont = font.deriveFont(Font.ITALIC, -size);
   FlowLayout flow = new FlowLayout();
   Container con = getContentPane();
   public JUpsideDown()
   {
      con.setLayout(flow);
      con.setBackground(Color.WHITE);
      con.add(aButton);
      aButton.addActionListener(this);
   }     
   public void actionPerformed(ActionEvent e)
   {
      Graphics gr = getGraphics();
      if(x % 2 == 0)
      {
        gr.setFont(font);
        gr.setColor(Color.WHITE);
        gr.drawString(phrase, XPOS1, YPOS1);
        gr.setFont(upsideDownFont);
        gr.setColor(Color.RED);
        gr.drawString(phrase, XPOS2, YPOS2);
      }
      else
      {
        gr.setFont(upsideDownFont);
        gr.setColor(Color.WHITE);
        gr.drawString(phrase, XPOS2, YPOS2);
        gr.setFont(font);
        gr.setColor(Color.RED);
        gr.drawString(phrase, XPOS1, YPOS1);
      }
      ++x;
   }
   public static void main(String[] args)
   {
        JUpsideDown frame = new JUpsideDown();
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}