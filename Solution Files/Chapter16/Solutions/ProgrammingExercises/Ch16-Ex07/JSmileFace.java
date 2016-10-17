import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JSmileFace extends JFrame
{
   public void paint(Graphics gr)
   {
      super.paint(gr);
      gr.setColor(Color.yellow);
      gr.fillOval(50,50,100,100);
      gr.setColor(Color.black);
      gr.fillOval(75,75,10,10);
      gr.fillOval(100,75,10,10);
      gr.drawArc(75,75,50,50,200,140);
   }
   public static void main(String[] args)
   {
      JSmileFace frame = new JSmileFace();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}