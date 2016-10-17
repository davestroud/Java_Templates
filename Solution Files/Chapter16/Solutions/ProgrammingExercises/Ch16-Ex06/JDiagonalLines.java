import javax.swing.*;
import java.awt.*;
public class JDiagonalLines extends JFrame
{
   public void paint(Graphics gr)
   {
     super.paint(gr);
     int startX = 40;
     int startY = 40;
     int endX = 40;
     int endY = 40;
     final int INC = 20;
     int width = 300, height = 300;
     gr.drawRect(startX, startY, width, height);
     int longestPoint = width + startX;
     while(startX < longestPoint)
     {
       gr.drawLine(startX, startY, endX, endY);
       startX += INC;
       endY += INC;
     }
     while(startY < longestPoint)
     {
       gr.drawLine(startX, startY, endX, endY);
       startY += INC;
       endX += INC;
     }    
   }
   public static void main(String[] args)
   {
      JDiagonalLines frame = new JDiagonalLines();
      frame.setSize(400, 400);
      frame.setVisible(true);
   }
}
