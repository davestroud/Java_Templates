import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JRockPaperScissors extends JApplet implements ActionListener
{
    JLabel greeting = new JLabel("Rock, Paper, Scissors");
    JLabel promptLabel = new JLabel("Choose one button");
    Font headlineFont = new Font("Helvetica", Font.BOLD, 30);
    Font mediumFont = new Font("Helvetica", Font.BOLD, 18);
    JButton rock = new JButton("Rock");
    JButton paper = new JButton("Paper");
    JButton scissors = new JButton("Scissors");
    JLabel resultsLabel = new JLabel("");
    JLabel result1 = new JLabel();
    JLabel result2 = new JLabel();
    JLabel result3 = new JLabel();
    Container con = getContentPane();
    int playerCount = 0;
    int computerCount = 0;
    int tieCount = 0;
    final int LOW = 1;
    final int HIGH = 3; 

    public void init()
    {
       greeting.setFont(headlineFont);
       con.add(greeting);
       promptLabel.setFont(mediumFont);
       con.add(promptLabel);
       con.add(rock);
       con.add(paper);
       con.add(scissors);
       resultsLabel.setFont(mediumFont);
       con.add(resultsLabel);
       con.add(result1);
       con.add(result2);
       con.add(result3);
       con.setLayout(new FlowLayout());
       rock.addActionListener(this);
       paper.addActionListener(this);
       scissors.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       int computer;
       String msg;
       String userPick;
       String computerPick;
       computer = LOW + (int)(Math.random() * HIGH);
       if(computer == 1)
          computerPick = "rock";
       else
          if(computer == 2)
             computerPick = "paper";
          else
             computerPick = "scissors";
       if(e.getSource() == rock)   
       {
          userPick = "rock";
          if(computer == 1)
          {
             msg = "tie";
             ++tieCount;
          }
          else
            if(computer == 2)
            {
               msg = "computer";
               ++computerCount;
            }
            else
            {
               msg = "you";
               ++playerCount;
            }
       }
       else
         if(e.getSource() == paper)
         {
            userPick = "paper";
            if(computer == 2)
            {
              msg = "tie";
              ++tieCount;
            }
            else
              if(computer == 3)
              {
                 msg = "computer";
                 ++computerCount;
              }
              else
              {
                msg = "you";
                ++playerCount;
              }
         }
         else
         {
            userPick = "scissors";
            if(computer == 3)
            {
                 msg = "tie";
                 ++tieCount;
            }
            else
              if(computer == 1)
              {
                   msg = "computer";
                   ++computerCount;
              }
              else
              {
                 msg = "you";
                 ++playerCount;
              }
         }
         
         con.remove(resultsLabel);
         con.remove(result1);
         con.remove(result2);
         con.remove(result3);
         resultsLabel.setText("------Results------");
         result1.setText("You picked " + userPick + " ----  Computer picked " + computerPick);
         result2.setText("Winner: " + msg);
         result3.setText("You: " + playerCount + "   Computer: " + computerCount +
           "   Ties: " + tieCount);
         con.add(resultsLabel);
         con.add(result1);
         con.add(result2);
         con.add(result3);
         validate();
         resultsLabel.setLocation(40, 70);
         result1.setLocation(30,100);
         result2.setLocation(30,120);
         result3.setLocation(30,140);
      }
        
}
