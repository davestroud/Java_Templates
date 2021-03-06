import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SmarterLastManStanding extends JFrame implements ItemListener, ActionListener
{
   final int BOXES = 10;
   final int MAXCHOICES = 3;
   FlowLayout flow = new FlowLayout();
   JLabel greeting = new JLabel("Select 1, 2 or 3 boxes");
   Font serifBold = new Font("Serif", Font.BOLD, 20);
   JCheckBox[] box = new JCheckBox[BOXES];
   JButton button = new JButton("Done");
   boolean[] isChosen = new boolean[BOXES];
   boolean computersTurn = false;
   boolean allDone = false;
   int x, y;
   int ran;
   int numChosen;
   public SmarterLastManStanding()
   {
      super("LastManStanding");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setLayout(flow);
      add(greeting);
      greeting.setFont(serifBold);
      for(x = 0; x < BOXES; ++x)
      {
         box[x] = new JCheckBox();
         add(box[x]);
         box[x].addItemListener(this);
      }
      add(button);
      button.addActionListener(this);
   }
   public static void main(String[] arguments)
   {
      SmarterLastManStanding frame = new SmarterLastManStanding();
      frame.setSize(300,120);
      frame.setVisible(true);
   }
   public void itemStateChanged(ItemEvent check)
   {
      if(!computersTurn)
      {
         Object source = check.getItem();
         for(x = 0; x < BOXES; ++x)
         {
             if(source == box[x])
             {
                  box[x].setSelected(true);
                  if(numChosen < MAXCHOICES)
                  {
                      isChosen[x] = true;
                      ++numChosen;
                  }
                  else
                      box[x].setSelected(false);   
                  x = BOXES; 
               }
          }
       }
   }
   public void actionPerformed(ActionEvent e)
   {
         if(allDone())
         { 
                String winner = "You win";
                finishUp(winner);
         }
         else
         {
             computersTurn = true;
             int boxesRemaining = howManyFreeBoxes();
             boxesRemaining = boxesRemaining % 4;
             if(boxesRemaining == 1)
                ran = 0;
             else
                  if(boxesRemaining == 2)
                     ran = 1;
                  else
                        if(boxesRemaining == 3)
                           ran = 2;
                        else
                           ran = ((int)(Math.random() * 100) % MAXCHOICES);
             for(x = 0; x <= ran; ++x)
             {
                  for(y = 0; y < BOXES; ++y)
                  {
                      if(!isChosen[y])
                      {
                         isChosen[y] = true;
                         box[y].setSelected(true);
                         y = BOXES;
                      }
                  }
             }
             computersTurn = false;
             if(allDone())
             { 
                String winner = "Computer wins";
                finishUp(winner);    
             }
             numChosen = 0;
         }
    }
    public boolean allDone()
    {
         boolean isDone = true;
         for(x = 0; x < BOXES; ++x)
         {
               if(!isChosen[x])
                  isDone = false;
         }
         return isDone;
    }
    public void finishUp(String winner)
    {
         button.setEnabled(false);
         for(x = 0; x < BOXES; ++x)
               remove(box[x]);
         JLabel done = new JLabel("Game over - " + winner);
         add(done);
         validate();
         repaint();
    }
    public int howManyFreeBoxes()
    {
       int count = 0;
       for(x = 0; x < BOXES; ++x)
            if(!isChosen[x])
               ++count;
       return count;
    }
 
}
