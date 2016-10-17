import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class JGraphicDie extends JApplet implements ActionListener
{
   GraphicDie gDie = new GraphicDie(); 
   public void init()
   {
     repaint();
   }
   public void actionPerformed(ActionEvent e)
   {
   }
   public void paint(Graphics gr)
   {
      super.paint(gr);
      gDie.drawDie(gr, 50,50);
   }
}
