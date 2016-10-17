import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JEraseImage extends JApplet implements ActionListener
{
   private ImageIcon image;
   private int imageWidth, imageHeight;
   private int firstShow;
   Container con = getContentPane();
   private JButton eraseButton = new JButton("Erase the image");
   private int startPosX = 50;
   private int startPosY = 40;
   public void init()
   {
      firstShow = 1;
      image = new ImageIcon( "event.gif" );
      imageWidth = image.getIconWidth();
      imageHeight = image.getIconHeight();
      con.setLayout(new FlowLayout());
      con.add(eraseButton);
      eraseButton.addActionListener(this);
   }
   public void paint( Graphics g )
   {
      super.paint(g);
      eraseButton.repaint();
      g.setColor(getBackground());
      if(firstShow == 1)
      {
         image.paintIcon(con, g, startPosX, startPosY);
         firstShow = 0;
      }
      else
        for(int count = 0; count < 20; ++count)
        {
         int x = (int) (Math.random() * imageWidth) + startPosX;
         int y = (int) (Math.random() * imageHeight) + startPosY;
         g.fillOval(x, y, 10, 10);
        }
     }
   public void actionPerformed( ActionEvent event )
   {
      repaint();
   }

}
