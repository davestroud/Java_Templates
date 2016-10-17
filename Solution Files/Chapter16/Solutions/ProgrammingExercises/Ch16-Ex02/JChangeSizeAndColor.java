import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JChangeSizeAndColor extends JFrame implements ActionListener
{
   String phrase = new String("There's no place like home");
   int x = 0;
   int xpos = 10;
   final int YPOS = 120;
   int size = 32;
   JButton aButton = new JButton("Click here");
   Font font = new Font("Helvetica", Font.ITALIC, size);
   FlowLayout flow = new FlowLayout();
   Container con = getContentPane();
   final int CHANGE = 8;
   final int MOVE_TO_RIGHT = 100;

   public JChangeSizeAndColor()
   {
      con.setLayout(flow);
      con.setBackground(Color.WHITE);
      con.add(aButton);
      aButton.addActionListener(this);
   }

   public void drawIt(Color color)
   {
      Graphics gr = getGraphics();
      gr.setFont(font);
      gr.setColor(Color.WHITE);
      gr.drawString(phrase, xpos, YPOS);
      font = font.deriveFont(Font.ITALIC, size -= CHANGE);
      gr.setFont(font);
      gr.setColor(color);
      gr.drawString(phrase, xpos += MOVE_TO_RIGHT, YPOS);
   }
      
   public void actionPerformed(ActionEvent e)
   {
     if(x == 0)
     {
         drawIt(Color.BLUE); 
         ++x;
     }
     else
     {
         if(x == 1)
         {
            drawIt(Color.RED);
            ++x;
         }
         else
         {
            drawIt(Color.GREEN);
            ++x;
         }
      }
   }
   public static void main(String[] args)
   {
        JChangeSizeAndColor frame = new JChangeSizeAndColor();
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}