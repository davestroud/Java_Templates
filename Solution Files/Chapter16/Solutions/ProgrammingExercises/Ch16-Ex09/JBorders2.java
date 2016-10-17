import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class JBorders2 extends JFrame
{
  String myName = new String("Joyce");
  Font serifItalic = new Font("Serif", Font.ITALIC, 20);
  int leading, ascent, descent, height, width;
  int a, x = 60, y = 100;
  int border = 10;
  final int NUM = 5;
  final int FACTOR = 10;
  public void paint(Graphics gr)
  {
     super.paint(gr);
     for(a = 1; a < NUM; ++a)
     {
       border = a * FACTOR;
       if (a == 1)
         gr.setColor(Color.magenta);
       else if (a == 2)
         gr.setColor(Color.yellow);
       else if (a==3)
         gr.setColor(Color.orange);
       else gr.setColor(Color.blue);
       gr.setFont(serifItalic);
       gr.drawString(myName,x,y);

       leading = gr.getFontMetrics().getLeading();
       ascent = gr.getFontMetrics().getAscent();
       descent = gr.getFontMetrics().getDescent();
       height = gr.getFontMetrics().getHeight();
       width = gr.getFontMetrics().stringWidth(myName);
       gr.drawRect(x - border,
            y - (ascent + leading + border),
            width + 2 * border, height + 2 * border);
      }
   }
   public static void main(String[] args)
   {
      JBorders2 frame = new JBorders2();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}
