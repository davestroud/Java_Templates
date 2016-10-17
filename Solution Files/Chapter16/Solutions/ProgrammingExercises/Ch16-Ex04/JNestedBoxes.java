import javax.swing.*;
import java.awt.*;
public class JNestedBoxes extends JFrame
{
   public void paint(Graphics gr)
   {
     super.paint(gr);
     int count;
     final int NUMBOXES = 8;
     final int INC = 20;
     int x = 40;
     int y = 40;
     int width = 300, height = 300;
     for(count = 0; count < NUMBOXES; ++count)
     {
       gr.drawRect(x, y, width, height);
       x += INC;
       y += INC;
       width -= INC * 2;
       height -= INC * 2;
     }     
   }
   public static void main(String[] args)
   {
      JNestedBoxes frame = new JNestedBoxes();
      frame.setSize(380, 380);
      frame.setVisible(true);
   }
}
