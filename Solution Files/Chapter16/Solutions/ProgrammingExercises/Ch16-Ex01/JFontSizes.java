import javax.swing.*;
import java.awt.*;

public class JFontSizes extends JFrame
{
   String phrase = new String("There's no place like home");
   final int START = 6;
   final int STOP = 20;
   final int HORIZ_POS = 50;
   int vertPos = 10;
   final int INCREASE = 20;

   public void paint(Graphics g)
   {
      super.paint(g);
      for(int i = START; i <= STOP; ++i)
      {
         Font myFont = new Font("Times New Roman", Font.BOLD, i);
         g.setFont(myFont);
         g.drawString(phrase, HORIZ_POS, vertPos);
         vertPos += INCREASE;
      }
   }
   public static void main(String[] args)
   {
      JFontSizes frame = new JFontSizes();
      frame.setSize(360, 340);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}