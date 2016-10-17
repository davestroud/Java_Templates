import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class JStopSign extends JFrame
{
    public void paint(Graphics g)
    {
      super.paint(g);
      // Define coordinates of outer polygon (edge of sign) and
      // inner polygon (red portion)
      int[] xOuter = {56, 107, 143, 143, 107, 56, 20, 20};
      int[] yOuter = {40, 40, 76, 127, 163, 163, 127, 76};
      int[] xInner = {57, 106, 138, 138, 106, 57, 25, 25};
      int[] yInner = {45, 45, 77, 126, 158, 158, 126, 77};

      // Draw edge of sign in black
      g.setColor(Color.black);
      g.drawPolygon(xOuter, yOuter, xOuter.length);

      // Fill interior of sign with red
      g.setColor(Color.red);
      g.fillPolygon(xInner, yInner, xInner.length);

      // Display "STOP" in white
      g.setColor(Color.white);
      g.setFont(new Font("SansSerif", Font.BOLD, 36));
      g.drawString("STOP", 33, 116);
   }
   public static void main(String[] args)
   {
      JStopSign frame = new JStopSign();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}
