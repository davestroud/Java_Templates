// This program should display a bullseye, not a cone
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class FixDebugSixteen1 extends JFrame
{
   String msg = "This is a bull's eye";
   public FixDebugSixteen1()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void paint(Graphics gr)
   {
      super.paint(gr);
     // Need to decrement the 'corner' dimension to create the bullseye shape
     // instead of the cone
      int radius,corner;
      for(corner = 150, radius = 2; radius < 200; radius += 6, corner -= 3)
      {
         if(radius < 50)
            gr.setColor(Color.RED);
         else if(radius < 100)
            gr.setColor(Color.GREEN);
         else if (radius < 150)
            gr.setColor(Color.YELLOW);
         else
            gr.setColor(Color.BLUE);
         gr.drawOval(corner, corner, radius, radius);

      }
      gr.setFont(new Font("Arial", Font.ITALIC, 20));
      gr.setColor(Color.BLACK);
      gr.drawString(msg, 100, 150);
   }
   public static void main(String[] args)
   {
      FixDebugSixteen1 frame = new FixDebugSixteen1();
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
}