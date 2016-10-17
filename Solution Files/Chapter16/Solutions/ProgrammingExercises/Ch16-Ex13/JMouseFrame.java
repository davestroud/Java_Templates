import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class JMouseFrame extends JFrame
 implements MouseListener
{
   Container con = getContentPane();
   int x, y;
   int size;
   final int LARGE = 10;
   final int SMALL = 4;
   public JMouseFrame()
   {
      setTitle("Mouse Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      con.addMouseListener(this);
   }
 	
   public void mouseClicked(MouseEvent e)
   {
      x = e.getX();
      y = e.getY();
      if(e.getButton() == MouseEvent.BUTTON1)
         size = LARGE;
      else
         size = SMALL;
      repaint();
   } 
   public void mouseEntered(MouseEvent e)
   {
      con.setBackground(Color.YELLOW);
   }
   public void mouseExited(MouseEvent e)
   {
      con.setBackground(Color.BLACK);
   }
   public void mousePressed(MouseEvent e)
   {
   } 
   public void mouseReleased(MouseEvent e)
   {
   }
   public void paint(Graphics g)
   {
      super.paint(g);
      g.drawOval(x - size, y - size, size * 2, size * 2);
   }

   public static void main(String[] args)
   {
      JMouseFrame mFrame = new JMouseFrame();
      final int WIDTH = 250;
      final int HEIGHT = 150;
      mFrame.setSize(WIDTH, HEIGHT);
      mFrame.setVisible(true);
   }
}
