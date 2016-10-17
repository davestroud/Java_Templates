import javax.swing.*;
import java.awt.*;
public class JDemoAliens extends JApplet
{
   Martian m = new Martian();
   Jupiterian j = new Jupiterian();
   public void paint(Graphics g)
   { 
      m.draw(g, 50, 50);
      j.draw(g, 200, 100);
   }
}
