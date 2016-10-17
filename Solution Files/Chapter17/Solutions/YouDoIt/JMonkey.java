import java.awt.*;
import javax.swing.*;
public class JMonkey extends JApplet
{
   private ImageIcon image = new ImageIcon("monkey.gif");
   private int width, height;
   Container con = getContentPane();
   int x = 30;
   int y = 30;
   public void init()
   {
      con.setLayout(new FlowLayout());
      width = image.getIconWidth();
      height = image.getIconHeight();
   }
   public void paint(Graphics g)
   {
      super.paint(g);
      g.drawString("No, no, no", x, y);
      g.drawImage(image.getImage(), x, y + 20, width, height, this);
   }
}
