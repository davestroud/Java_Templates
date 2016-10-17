import javax.swing.*;
import java.awt.*;
public class JNestedCircles extends JFrame
{
   public void paint(Graphics gr)
   {
      super.paint(gr);
      int count;
      final int NUM = 15;
      final int INC = 10;
      int x = 20;
      int y = 40;
      int width = 300, height = 300;
      for(count = 0; count < NUM; ++count)
      {
         gr.drawOval(x, y, width, height);
         x += INC;
         y += INC;
         width -= INC * 2;
         height -= INC * 2;
      }     
   }
   public static void main(String[] args)
   {
      JNestedCircles frame = new JNestedCircles();
      frame.setSize(400, 400);
      frame.setVisible(true);
   }
}
