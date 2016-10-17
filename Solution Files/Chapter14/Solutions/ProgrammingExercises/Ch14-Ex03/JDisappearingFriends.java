import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDisappearingFriends extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JButton b = new JButton("Press to change friends");
   JLabel f1 = new JLabel("Amy");
   JLabel f2 = new JLabel("Beth");
   JLabel f3 = new JLabel("Charlie");
   JLabel f4 = new JLabel("Dave");
   JLabel f5 = new JLabel("Emma");
   int counter = 0;
   public JDisappearingFriends()
   {
      super("Friends");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(b);
      add(f1);
      b.addActionListener(this);
   }
    public static void main(String[] args)
    {

       JDisappearingFriends rFrame = new JDisappearingFriends();
       rFrame.setSize(200,200);
       rFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
      ++counter;
      if(counter == 5)
        counter = 0;
      if(counter == 1)
      {
          remove(f1);
          add(f2);
      }
      else
         if(counter == 2)
         {
             remove(f2);
             add(f3);
         }
         else
             if(counter == 3)
             {
                  remove(f3);
                  add(f4);
             }
             else
                if(counter == 4)
                {
                   remove(f4);
                   add(f5);
                }
                else
                {
                    remove(f5);
                    add(f1);
                }
                   

      validate();
      repaint();
  }

}