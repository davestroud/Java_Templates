import javax.swing.*;
import java.awt.*;
public class Martian extends Alien
{
   public Martian()
   {
      super(7, 3, 4);  
   }
   public void draw(Graphics g, int x, int y)
   {
     int h = 5;
     int xx = x + 30;
     int yy = y + 70;
     // head
     g.drawOval(x, y, 100, 100);
     // eyes
     g.drawOval(x + 20, y + 35, 10, 10);
     g.drawOval(x + 40, y + 35, 10, 10);
     g.drawOval(x + 60, y + 35, 10, 10);
     g.drawOval(x + 80, y + 35, 10, 10);
     g.fillOval(x + 20, y + 35, 5, 5);
     g.fillOval(x + 40, y + 35, 5, 5);
     g.fillOval(x + 60, y + 35, 5, 5);
     g.fillOval(x + 80, y + 35, 5, 5);
     
     // mouth
     for(int i = 0; i < 4; ++i)
     {
        g.drawLine(xx, yy, xx += h, yy +=h);
        g.drawLine(xx, yy, xx += h, yy -=h);
     }
     // legs
     g.drawLine(x + 25, y + 90, x + 15, y + 120);
     g.drawLine(x + 50, y + 100, x + 50, y + 120);
     g.drawLine(x + 75, y + 90, x + 75, y + 120);
     g.drawString("A Martian", x + 20, y + 150);
   } 
}