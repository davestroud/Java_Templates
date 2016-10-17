import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JChangeSizeAndColor2 extends JFrame implements ActionListener
{
   String phrase = new String("There's no place like home");
   int x = 0;
   final int STARTPOS = 10;
   int xpos = STARTPOS;
   final int YPOS = 120;
   final int STARTSIZE = 32;
   int size = STARTSIZE;
   JButton aButton = new JButton("Click here");
   Font font = new Font("Helvetica", Font.ITALIC, size);
   FlowLayout flow = new FlowLayout();
   Container con = getContentPane();
   final int CHANGE = 8;
   final int MOVE_TO_RIGHT = 100;
   Color[] colors = {Color.BLUE, Color.RED, Color.GREEN};

   public JChangeSizeAndColor2()
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
     if(x == 3)
     {
         x = 0;
         size = STARTSIZE;
         xpos = STARTPOS;
     }
     drawIt(colors[x]); 
     ++x;
   }
   public static void main(String[] args)
   {
        JChangeSizeAndColor2 frame = new JChangeSizeAndColor2();
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}