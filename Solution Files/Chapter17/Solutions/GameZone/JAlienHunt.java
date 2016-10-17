import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class JAlienHunt extends JApplet implements ActionListener
{
    final int NUM = 8;
    final int JUPITERIANS_TO_LOSE = 2;
    Martian m = new Martian();
    Jupiterian j = new Jupiterian();
    JLabel greeting = new JLabel("** Alien Hunt **");
    JLabel promptLabel = new JLabel("   ---    Choose a button    ---    ");
    Font headlineFont = new Font("Arial", Font.BOLD, 30);
    Font mediumFont = new Font("Arial", Font.BOLD, 18);
    JButton[] button = new JButton[NUM];
    JLabel result1 = new JLabel("");
    JLabel result2 = new JLabel("");
    Container con = getContentPane();
    int random1, random2;
    int x, jcount = 0, mcount = 0, pos;
    int xpos = 50;
    int ypos = 175;
    int buttonVal;
    char nextDraw = ' ';
    boolean[] isUsed = new boolean[NUM];
    boolean twoJupiterians = false;
    public void init()
    {
       greeting.setFont(headlineFont);
       promptLabel.setFont(mediumFont);
       result1.setFont(mediumFont);
       result2.setFont(mediumFont);
       con.add(greeting);
       con.add(promptLabel);
       con.setBackground(Color.WHITE);
       for(x = 0; x < NUM; ++x)
       {
          button[x] = new JButton("" + (x + 1));
          con.add(button[x]);
          button[x].addActionListener(this);
          isUsed[x] = false;
       }

             
       con.add(result1);
       con.add(result2);
       con.setLayout(new FlowLayout());
       random1 = (int) ((Math.random() * 100) % NUM);
       random2 = random1;
       while(random2 == random1)
           random1 = (int) ((Math.random() * 100) % NUM);
    }  
    public void actionPerformed(ActionEvent e)
    {
       int pos;
       JButton temp = (JButton)e.getSource();
       buttonVal = Integer.parseInt(temp.getText());
       pos = buttonVal - 1;
       if(!isUsed[pos])
       {
          isUsed[pos] = true;
          button[pos].setEnabled(false);
          if(pos == random1 || pos == random2)
          {
             nextDraw = 'j';
             ++jcount;
             result1.setText("Jupiterian found");
          }
          else
          {
             nextDraw = 'm';
             ++mcount;
             result1.setText("Martian found");
          }
          if(jcount == JUPITERIANS_TO_LOSE)
          {
            result2.setText("Earth destroyed - you lose!");
            for(x = 0; x < NUM; ++x)
              button[x].setEnabled(false);
            twoJupiterians = true;
        }
        if(mcount == (NUM - JUPITERIANS_TO_LOSE))
        {
            result2.setText("Earth saved - you win!");
            for(x = 0; x < NUM; ++x)
              button[x].setEnabled(false);
        }
      }   
         
      validate();   
      repaint();
  
    }
    public void paint(Graphics g)
    {
       super.paint(g);
       for(x = 0; x < NUM; ++x)
       {
         button[x].repaint();
       }
       greeting.repaint();
       promptLabel.repaint();
       result1.repaint();
       result2.repaint();
       if(nextDraw == 'm')
       {
           g.setColor(Color.WHITE);
           j.draw(g, xpos, ypos);
           g.setColor(Color.BLACK);
           m.draw(g, xpos, ypos);
       }
       else
          if(nextDraw == 'j')
          {
             g.setColor(Color.WHITE);
             m.draw(g, xpos, ypos);
             g.setColor(Color.BLACK);
             j.draw(g, xpos, ypos);
          }
       if(twoJupiterians == true)
       {
           g.setColor(Color.BLACK);
           j.draw(g, xpos + 90, ypos);
       }
    }      
}
