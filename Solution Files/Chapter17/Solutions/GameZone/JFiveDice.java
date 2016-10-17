import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.geom.*;
public class JFiveDice extends JApplet implements ActionListener
{
    final int NUM = 5;
    Container con = getContentPane();
    JButton button = new JButton("Click");
    GraphicDie[] comp = new GraphicDie[NUM];
    GraphicDie[] player =  new GraphicDie[NUM];
    GraphicDie[] compSave = new GraphicDie[NUM];
    GraphicDie[] playerSave =  new GraphicDie[NUM];
    int x;
    int compMatch, playerMatch;
    int compHigh, playerHigh;
    String computerName = "Computer";
    String playerName = "You";
    JLabel greeting = new JLabel("** Five Dice **");
    JLabel prompt = new JLabel("   ---    Click the button to roll    ---    ");
    Font headlineFont = new Font("Arial", Font.BOLD, 30);
    Font mediumFont = new Font("Arial", Font.BOLD, 18);
    JLabel result1 = new JLabel("");
    JLabel result2 = new JLabel("");
    boolean hasClicked = false;
    public void init()
    {
       con.setLayout(new FlowLayout());
       greeting.setFont(headlineFont);
       prompt.setFont(mediumFont);
       con.setBackground(Color.WHITE);
       con.add(greeting);
       con.add(prompt);
       button.addActionListener(this);
       con.add(button);
       con.add(result1);
       con.add(result2);
       repaint();
    }
    public void actionPerformed(ActionEvent e)
    {
       if(!hasClicked)
       {
         for(x = 0; x < NUM; ++x)
         {
            compSave[x] = new GraphicDie();
            playerSave[x] = new GraphicDie();
            comp[x] = new GraphicDie();
            player[x] = new GraphicDie();
         }
       }
       hasClicked = true;
       for(x = 0; x < NUM; ++x)
       {
          compSave[x] = comp[x];
          playerSave[x] = player[x];
          comp[x] = new GraphicDie();
          player[x] = new GraphicDie();
       }
       display(computerName, comp, NUM);
       display(playerName, player, NUM);
       compMatch = howManySame(comp, NUM);
       playerMatch = howManySame(player, NUM);
       compHigh = compMatch / 10;
       playerHigh = playerMatch / 10;
       compMatch = compMatch % 10;
       playerMatch = playerMatch % 10;
       if(compMatch == 1)
         result1.setText("Computer has nothing");
       else
         result1.setText("Computer has " + compMatch + " of a kind");
       if(playerMatch == 1)
         result1.setText("You have nothing");
       else
         result1.setText("You have " + playerMatch + " of a kind"); 

       if(compMatch > playerMatch)
          result2.setText("Computer wins");
       else
          if(compMatch < playerMatch)
             result2.setText("You win");
          else
            if(compHigh > playerHigh)
              result2.setText("Computer's values are higher - computer wins");
            else
              if(compHigh < playerHigh)
                 result2.setText("Your values are higher - you win");
              else
                 result2.setText("It's a tie");
        repaint();
    }
    public void paint(Graphics gr)
    {
          super.paint(gr);
          int h = 70, v = 100;
          int i = 100;
          greeting.repaint();
          prompt.repaint();
          button.repaint();
          result1.repaint();
          result2.repaint();
          if(hasClicked)
          {
            gr.setColor(Color.WHITE);
            for(x = 0; x < NUM; ++x)
            {
               playerSave[x].drawDie(gr, h, v);
               compSave[x].drawDie(gr, h, v + i);
               h += i;
            } 
            h = 70;
            gr.setColor(Color.BLACK);
            gr.drawString("     You: ", 2, v +  v / 2 );
            gr.drawString("Computer: ", 2, v + v / 2 + i);
            for(x = 0; x < NUM; ++x)
            {
               player[x].drawDie(gr, h, v);
               comp[x].drawDie(gr, h, v + i);
               h += i;
            } 
          }            
        
    }

    public void display(String who, GraphicDie[] die, int num)
    {
       int x;
       String dice = "";
       for(x = 0; x < num; ++x)
          dice = dice + die[x].getValue() + " ";
       result1.setText(who + " rolled: " + dice);
    }
    public static int howManySame(GraphicDie[] die, int num)
    {
       int[] same = new int[num];
       int x, y;
       int highest;
       int highValue = 0;
       for(x = 0; x < num; ++x)
         same[x] = 1; // every die matches itself
       for(x = 0; x < num - 1; ++x)
       {
         for(y = x + 1; y < num; ++y)
           if(die[x].getValue() == die[y].getValue())
           {
               same[x]++;
               if(die[x].getValue() > highValue)
                  highValue = die[x].getValue();
           }
       }
       highest = same[0];
       for(x = 1; x < num; ++x)
          if(same[x] > highest)
            highest = same[x];
       highest = highest + 10 * highValue;
       return highest;
    } 
}
  
     
 