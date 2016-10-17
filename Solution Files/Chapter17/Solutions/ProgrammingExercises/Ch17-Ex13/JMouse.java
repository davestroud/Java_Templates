import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class JMouse extends JApplet implements MouseListener
{
   Container con;
   JPanel p1 = null;
   int width, height;
   int x, y;
   int flag;
   String mouseStatus;

   public void init()
   {
      x = 0; y = 0;
      width = 2; height = 2;
      con = this.getContentPane();
      con.addMouseListener(this);
      p1 = new JPanel();
      p1.setBackground(Color.lightGray);
      con.add(p1);
   }

   public void mouseEntered(MouseEvent e)
   {
     Graphics g = getGraphics();
     g.setColor(Color.blue);
     g.drawString("Roll into the applet and Click the Mouse Button...", 5, 20);
     g.setColor(Color.red);
     g.drawString("Mouse Entered Applet", 5, 80);
     g.setColor(Color.lightGray);
     g.drawString("Mouse Exited Applet", 5, 100);
     validate();
     invalidate();
   }

   public void mouseExited(MouseEvent e)
   {
      Graphics g = getGraphics();
      g.setColor(Color.blue);
      g.drawString("Roll into the applet and Click the Mouse Button...", 5, 20);
      g.setColor(Color.red);
      g.drawString("Mouse Exited Applet", 5, 100);
      g.setColor(Color.lightGray);
      g.drawString("Mouse Entered Applet", 5, 80);
      validate();
      invalidate();
   }

   public void mouseClicked(MouseEvent e)
   {
      Graphics g = getGraphics();
      x = e.getX();
      y = e.getY();
      g.fillRect(x, y, width, height);
      g.drawString("Mouse Clicked Here", x, y);
   }

   public void mousePressed(MouseEvent e)
   {
   }

   public void mouseReleased(MouseEvent e)
   {
   }
}


