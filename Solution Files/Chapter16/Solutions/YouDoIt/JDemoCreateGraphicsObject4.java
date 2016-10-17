import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JDemoCreateGraphicsObject4 extends JFrame 
 implements ActionListener  
{ 
   String movieQuote = new String("Here's looking at you, kid"); 
   JButton moveButton = new JButton("Move It");  
   Font broadwayFont = new Font("Broadway", Font.ITALIC, 12);
   int x = 10, y = 50; 
   final int GAP = 20;
   final int SIZE = 400;
   final int LIMIT = SIZE - 50;
   public JDemoCreateGraphicsObject4()
   {
      Container con = getContentPane();
      con.setBackground(Color.YELLOW); 
      con.setLayout(new FlowLayout() );
      con.add(moveButton);
      moveButton.addActionListener(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(SIZE, SIZE);
   }
   public void actionPerformed(ActionEvent e)
   {
      Graphics pen = getGraphics();
      pen.setFont(broadwayFont);
      pen.setColor(Color.MAGENTA);
      if(y < LIMIT)
         pen.drawString(movieQuote, x += GAP, y += GAP);
      else
      {
          moveButton.setEnabled(false);
          pen.setColor(Color.BLACK);
          pen.drawOval(50, 170, 70, 70);
          pen.drawLine(85, 240, 90, 280); 
          pen.drawLine(90, 280, 60, 380);
          pen.drawLine(90, 280, 110, 380);
          // feet
          pen.drawLine(110, 380, 125, 375);
          pen.drawLine(60, 380, 45, 375);
          // arms
          pen.drawLine(86, 260, 20, 230);
          pen.drawLine(86, 260, 152, 230);
          // face
          pen.drawOval(70, 200, 10, 10);
          pen.drawOval(90, 195, 10, 10);
          pen.drawArc(70, 190, 40, 40, 200, 150);
      }
   }
   public static void main(String[] args)
   {
      JDemoCreateGraphicsObject4 frame = new JDemoCreateGraphicsObject4();
      frame.setVisible(true);
   }
}
