import javax.swing.*;
import java.awt.*;
public class Jupiterian extends Alien
{
   public Jupiterian()
   {
      super(2, 8, 2);
   }
   public void draw(Graphics g, int x, int y)
   {
     int w = 10;
     int xx = x;
     //head
     g.drawOval(x, y, 60, 60);
     // antennae
     g.drawArc(x - 40, y - 30, 60, 60, 0, 80);
     g.drawArc(x + 40, y - 30, 60, 60, 100, 80);
     //eyes
     g.drawOval(x + 20, y + 20, 10, 10);
     g.drawOval(x + 40, y + 20, 10, 10);
     //legs
     for(int a = 0; a < 8; ++a)
     {
        g.drawLine(xx + w, y + 60,
            xx + w - 10, y + 80);
        xx += 5;
     } 
     g.drawString("A Jupiterian", x + 20, y + 100);
   }
}