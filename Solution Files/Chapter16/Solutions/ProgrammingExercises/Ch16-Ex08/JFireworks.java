import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JFireworks extends JFrame
{
   int x1Points[] = {42,52,72,52,60,40,15,28,9,32,42};
   int y1Points[] = {38,62,68,80,105,85,102,75,58,30,38};
   int x2Points[] = {62,72,92,72,80,60,35,48,29,52,62};
   int y2Points[] = {48,72,78,90,115,95,112,85,68,40,48};

   public void paint(Graphics gr)
   {
     super.paint(gr);
     gr.setColor(Color.red);
     gr.drawPolygon(x1Points, y1Points, x1Points.length);
     gr.setColor(Color.blue);
     gr.drawPolygon(x2Points, y2Points, x2Points.length);
     gr.setColor(Color.green);
     gr.drawLine(80,100,150,160);
     gr.drawLine(80,40,150,30);
     gr.drawLine(80,70,150,130);
     gr.drawLine(80,60,150,100);
   }
   public static void main(String[] args)
   {
      JFireworks frame = new JFireworks();
      frame.setSize(200, 150);
      frame.setVisible(true);
   }
}