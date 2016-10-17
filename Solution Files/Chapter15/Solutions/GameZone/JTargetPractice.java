import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class JTargetPractice extends JFrame implements MouseListener
{
   final int ROWS = 10;
   final int COLS = 10;
   final int GAP = 2;
   final int NUM = ROWS * COLS;
   final int CHANCES = 20;
   final int ATONCE = 5;
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] panel = new JPanel[NUM];
   JLabel[] label = new JLabel[ATONCE];
   int[] currentPanel = new int[ATONCE];
   int count = 0;
   int countHit = 0;
   long startMill, stopMill, timeChange;
   final long TIME = 10000L;
   public JTargetPractice()
   {
      super("Target Practice");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      for(int x = 0; x < NUM; ++x)
      {
         panel[x] = new JPanel();
         pane.add(panel[x]);
         panel[x].addMouseListener(this);
      }
      setContentPane(pane);
      for(int y = 0; y < ATONCE; ++y)
      {
         label[y] = new JLabel("X");
         currentPanel[y] = ((int)(Math.random() * 100) % NUM);
         panel[currentPanel[y]].add(label[y]);
      }
      GregorianCalendar now = new GregorianCalendar();
      startMill = now.getTimeInMillis();
      repaint();
   }
   public static void main(String[] arguments)
   {
      JTargetPractice frame = new JTargetPractice();
      frame.setSize(450,300);
      frame.setVisible(true);
   }
   public void mouseClicked(MouseEvent mEvent)
   {
      Object source = mEvent.getSource();
      for(int x = 0; x < NUM; ++x)
      {
         if(source == panel[currentPanel[x]])
         {
            label[x].setText("BAM");
            ++count;
            ++countHit;
            if(countHit == ATONCE)
            {
               countHit = 0;
               for(int y = 0; y < ATONCE; ++y)
               {
                   panel[currentPanel[y]].remove(label[y]);
                   label[y].setText("X");
                   currentPanel[y] = ((int)(Math.random() * 100) % NUM);
                   panel[currentPanel[y]].add(label[y]);  
                   repaint();
               }
            }
            x = NUM; 
         }      
      }
    
      GregorianCalendar later = new GregorianCalendar();
      stopMill = later.getTimeInMillis();
      timeChange = stopMill - startMill;
      if(timeChange >= TIME)
      {
        JLabel doneLabel =
           new JLabel("Congratulations! You hit " +
              count + " targets");
         for(int x = 0; x < NUM; ++x)
            pane.remove(panel[x]);
         pane.setLayout(new FlowLayout());
         pane.add(doneLabel);
         validate();
         repaint();
      }
   }
   public void mouseEntered(MouseEvent mEvent)
   {
   }
   public void mouseExited(MouseEvent mEvent)
   {
   }
   public void mousePressed(MouseEvent mEvent)
   {
   }
   public void mouseReleased(MouseEvent mEvent)
   {
   }

}
