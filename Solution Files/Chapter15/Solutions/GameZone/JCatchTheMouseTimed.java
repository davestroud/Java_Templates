import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class JCatchTheMouseTimed extends JFrame implements MouseListener
{
   final int ROWS = 8;
   final int COLS = 6;
   final int GAP = 2;
   final int NUM = ROWS * COLS;
   final int CHANCES = 10;
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] panel = new JPanel[NUM];
   JLabel label = new JLabel("X");
   int currentPanel;
   int count = 0;
   int clicks = 0;
   int startSecond, startMinute, stopSecond, stopMinute;
   final int SECONDS_IN_A_MINUTE = 60;
   GregorianCalendar now;
   public JCatchTheMouseTimed()
   {
      super("Catch The Mouse Timed");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      now = new GregorianCalendar();
      startSecond = now.get(Calendar.SECOND);
      startMinute = now.get(Calendar.MINUTE);
      for(int x = 0; x < NUM; ++x)
      {
        panel[x] = new JPanel();
        pane.add(panel[x]);
        panel[x].addMouseListener(this);
      }
      setContentPane(pane);
      currentPanel = ((int)(Math.random() * 100) % NUM);
      panel[currentPanel].add(label);
   }
   public static void main(String[] arguments)
   {
      JCatchTheMouseTimed frame = new JCatchTheMouseTimed();
      frame.setSize(450,300);
      frame.setVisible(true);
   }
   public void mouseClicked(MouseEvent mEvent)
   {
      ++clicks;
      Object source = mEvent.getSource();
      if(source == panel[currentPanel])
      {
         ++count;
         panel[currentPanel].remove(label);
         currentPanel = ((int)(Math.random() * 100) % NUM);
         panel[currentPanel].add(label);  
         repaint();      
      }
      if(count >= CHANCES)
      {
         GregorianCalendar later = new GregorianCalendar();
         String msg;
         stopSecond = later.get(Calendar.SECOND);
         stopMinute = later.get(Calendar.MINUTE);
         System.out.println(startMinute + " " + startSecond + " " + stopMinute + " " + stopSecond);
         if(startMinute == stopMinute)
            msg = (stopSecond - startSecond) + " seconds";
         else
            if((stopMinute - startMinute) == 1)
               msg = ((SECONDS_IN_A_MINUTE - startSecond) + stopSecond) + "seconds";
            else
               msg = (stopMinute - startMinute - 1) + " mintute(s) " + (SECONDS_IN_A_MINUTE - startSecond + stopSecond) + " seconds";
            
         JLabel doneLabel = new JLabel("Congratulations! You got all " + CHANCES + " in " + msg);
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
