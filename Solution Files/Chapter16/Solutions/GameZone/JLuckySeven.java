import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JLuckySeven extends JFrame implements ActionListener
{
    final int NUM = 7;
    JLabel greeting = new JLabel("Lucky Seven Game");
    JLabel promptLabel = new JLabel("  Choose one button     ");
    Font headlineFont = new Font("Arial", Font.BOLD, 30);
    Font mediumFont = new Font("Arial", Font.BOLD, 18);
    JButton[] button = new JButton[NUM];
    String[] label = new String[NUM];
    int[] value = {1, 2, 3, 4, 5, 6, 7};
    int[] randomVal = new int[NUM];
    JLabel result1 = new JLabel("");
    JLabel result2 = new JLabel("");
    Container con = getContentPane();
    int random;
    int x, pos;
    int buttonVal;
    int nextButtonPosition;
    int hiddenVal;
    int count = 1;
    boolean[] isUsed = new boolean[NUM];
    public JLuckySeven()
    {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       greeting.setFont(headlineFont);
       promptLabel.setFont(mediumFont);
       result1.setFont(mediumFont);
       result2.setFont(mediumFont);
       con.add(greeting);
       con.add(promptLabel);
       
       for(x = 0; x < NUM; ++x)
       {
          button[x] = new JButton("" + value[x]);
          con.add(button[x]);
          button[x].addActionListener(this);
       }
             
       con.add(result1);
       con.add(result2);
       con.setLayout(new FlowLayout());
       int y = 0;
       int numbersLeft = NUM;  
       boolean found = false;  
       for(x = 0; x < NUM; ++x)
       {
          found = false;
          while(!found)
          {
             random = (int) ((Math.random() * 100) % NUM) + 1;
             for(y = 0; y < numbersLeft; ++y)
             {
                if(random == value[y])
                {
                   randomVal[x] = random;
                   pos = y;
                   found = true;
                   y = numbersLeft;
                }
             }
          }
          for(y = pos; y < numbersLeft - 1; ++y)
          {
             value[y] = value[y + 1];
          }
          --numbersLeft;
        }  
                                      
    }
    public void actionPerformed(ActionEvent e)
    {
      int pos;
      JButton temp = temp = (JButton)e.getSource();
      buttonVal = Integer.parseInt(temp.getText());
      pos = buttonVal - 1;
   
      if(count == 1)
      {
         nextButtonPosition = pos;
      }
      if(pos == nextButtonPosition)
      {
          hiddenVal = randomVal[pos];
          result1.setText("The hidden number is " + hiddenVal + ".");
          
          if(buttonVal == hiddenVal || isUsed[hiddenVal - 1])
          {
             result2.setText("Sorry, you lose.");
             con.remove(promptLabel);
             for(x = 0; x < NUM; ++x)
             {
               isUsed[x] = true;
               button[x].setEnabled(false);
               con.remove(button[x]);
             }
          }
          else
          {          
            con.remove(button[pos]);
            isUsed[pos] = true;
            nextButtonPosition = hiddenVal - 1;
            ++count;
          }
      }
      if(count == NUM)
      {
         result2.setText("Congratulations - you got them all!");  
         con.remove(button[pos]);
         con.remove(promptLabel);
         for(x = 0; x < NUM; ++x)
         {
             isUsed[x] = true;
             button[x].setEnabled(false);
         }
      }
      validate();   
      repaint();
  
    }
    public static void main(String[] args)
    {
      JLuckySeven frame = new JLuckySeven();
      frame.setSize(400, 200);
      frame.setVisible(true);
    }
        
}
