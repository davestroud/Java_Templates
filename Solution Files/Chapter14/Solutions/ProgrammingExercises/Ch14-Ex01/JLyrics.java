import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLyrics extends JFrame
{
   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("I'll wear your colors, my dear");
   JLabel msg2 = new JLabel("Until you're standing right here");
   JLabel msg3 = new JLabel("Next to the one who adores you");
   JLabel msg4 = new JLabel("Whose heart is beating for you");
   public JLyrics()
   {
      super("Lyrics to Colors");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(msg1); 
      add(msg2);
      add(msg3);
      add(msg4);
   }
   public static void main(String[] args)
   {
     JLyrics aFrame = new JLyrics();
     aFrame.setSize(300,150);
     aFrame.setVisible(true);
   }
}