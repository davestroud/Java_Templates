// This program displays promotional messages
// with the click of a button
// The button is disabled when all messages are on screen
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class FixDebugSixteen3 extends JFrame implements ActionListener
{
   JLabel firstText = new JLabel("Our company is growing!");
   JLabel secText = new JLabel("What makes us better that most?");
   JButton findOutButton = new JButton("Find Out");
   FlowLayout flow = new FlowLayout();
   String[] reason= {"Our products","Our people",
        "Our committment","Our service","YOU!!"};
   Font boldFont =new Font("TimesRoman", Font.BOLD, 20);
   int x = 30, y = 80;
   int counter = -1;

   public FixDebugSixteen3()
   {
     Container con = getContentPane();
     con.setLayout(flow);
     setBackground(Color.PINK);
     con.add(firstText);
     con.add(secText);
     con.add (findOutButton);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     findOutButton.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e)
   {
      final int GAP = 25;
      Graphics gr = getGraphics();
      gr.setFont(boldFont);
      gr.setColor(Color.blue);
      // Must increment the counter
      ++ counter;
      if(counter >= reason.length)
         findOutButton.setEnabled(false);
      else
        gr.drawString(reason[counter], x, y += GAP);
   }
   public static void main(String[] args)
   {
      FixDebugSixteen3 frame = new FixDebugSixteen3();
      frame.setSize(350, 250);
      frame.setVisible(true);
   }
}