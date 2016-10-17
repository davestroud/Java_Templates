import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JSmileFace2 extends JFrame implements ActionListener
{
   JButton frown = new JButton("Click here");
   FlowLayout flow = new FlowLayout();

   int x = 0;
   public JSmileFace2()
   {
      Container con = getContentPane();
      con.setLayout(flow);
      con.add(frown);
      frown.addActionListener(this);
   }

   public void paint(Graphics gr)
   {
      super.paint(gr);
      gr.setColor(Color.yellow);
      gr.fillOval(50,50,100,100);
      gr.setColor(Color.black);
      gr.fillOval(75,75,10,10);
      gr.fillOval(100,75,10,10);
      gr.drawArc(75,75,50,50,200,140);
      frown.repaint();
   }

   public void actionPerformed(ActionEvent e)
   {
     Object source = e.getSource();
     if(source == frown)
     {
        Graphics gr = getGraphics();
        gr.setColor(Color.yellow);
        gr.drawArc(75,75,50,50,200,140);
        gr.setColor(Color.black);
        gr.drawArc(75,100,50,50,20,140);
     }
   }
   public static void main(String[] args)
   {
      JSmileFace2 frame = new JSmileFace2();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}