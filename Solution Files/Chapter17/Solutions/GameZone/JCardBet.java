import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JCardBet extends JApplet implements ActionListener
{
   final int CARDS_IN_DECK = 52;
   final int CARDS_EACH = CARDS_IN_DECK / 2;
   Card[] card = new Card[CARDS_IN_DECK];
   Card[] playerCard = new Card[CARDS_EACH];
   Card[] computerCard = new Card[CARDS_EACH];
   final int HIGH_VAL = 13;
   final int LOW_VAL = 1;
   final int HIGH_SUIT = 4;
   int x, y;
   int count = 0;
   int suit = 1, value = 1;
   int playerCardNum, computerCardNum;
   int winnings = 10;
   String msg;
   String compSuit, playerSuit;
   String playerRank, compRank;
   int compValue, playerValue;
   JLabel greeting = new JLabel("** Bet the Card **");
   JLabel promptLabel = new JLabel("Choose one button");
   Font headlineFont = new Font("Arial", Font.BOLD, 26);
   Font mediumFont = new Font("Arial", Font.BOLD, 18);
   JLabel displayComputerCard = new JLabel("");
   JLabel displayPlayerCard = new JLabel("");
   JButton button5H = new JButton("$5 Higher");
   JButton button10H = new JButton("$10 Higher");
   JButton button5L = new JButton("$5 Lower");
   JButton button10L = new JButton("$10 Lower");
   JButton buttonOK = new JButton("OK");

   JLabel result = new JLabel("Starting with $" + winnings);
     
   Container con = getContentPane();
  
 
   int random;
   int cardsLeft;

   public void init()
   {
      buttonOK.setEnabled(false);
      for(x = 0; x < CARDS_IN_DECK; ++x)
      {
         card[x] = new Card();
         if(suit == 1)
            card[x].setSuit("Spades");
         else
            if(suit == 2)
               card[x].setSuit("Hearts");
            else
               if(suit == 3)
                 card[x].setSuit("Diamonds");
               else
                 card[x].setSuit("Clubs");
         card[x].setValue(value);
         ++value;
         if(value > HIGH_VAL)
         {
            ++suit;
            value = 1;
         }
    }
    cardsLeft = CARDS_IN_DECK;
    for(x = 0; x < CARDS_EACH; ++x)
    { 
       playerCardNum = ((int)(Math.random() * 100) % cardsLeft);
       playerCard[x] = new Card();
       playerCard[x].setSuit(card[playerCardNum].getSuit());
       playerCard[x].setValue(card[playerCardNum].getValue());
       for(y = playerCardNum; y < cardsLeft - 1; ++y)
       card[y] = card[y + 1];
       --cardsLeft;
       computerCardNum = ((int)(Math.random() * 100) % cardsLeft);
       computerCard[x] = new Card();
       computerCard[x].setSuit(card[computerCardNum].getSuit());
       computerCard[x].setValue(card[computerCardNum].getValue());
       for(y = computerCardNum; y < cardsLeft -1; ++y)
       card[y] = card[y + 1];
      --cardsLeft;
       
   }
   compValue = computerCard[count].getValue();
   compSuit = computerCard[count].getSuit(); 
   compRank = computerCard[count].getRank();
   displayComputerCard.setText("Computer: " + compRank + " of " + compSuit);
   con.add(greeting);
   greeting.setFont(headlineFont);
   
   con.add(displayComputerCard);
   displayComputerCard.setFont(mediumFont);
   con.add(button5H);
   con.add(button10H);
   con.add(button5L);
   con.add(button10L);
   con.add(displayPlayerCard);
   displayPlayerCard.setFont(mediumFont);
   con.add(result);
   con.add(buttonOK);
   button5H.addActionListener(this);
   button10H.addActionListener(this);
   button5L.addActionListener(this);
   button10L.addActionListener(this);
   buttonOK.addActionListener(this);
   con.setLayout(new FlowLayout());
                     
    }
    public void actionPerformed(ActionEvent e)
    {
   
   Object source = e.getSource();
   if(source != buttonOK)
   {
    
    buttonOK.setEnabled(true);
    button5H.setEnabled(false);
    button10H.setEnabled(false);
    button5L.setEnabled(false);
    button10L.setEnabled(false);
    playerValue = playerCard[count].getValue();
    playerSuit = playerCard[count].getSuit();
    playerRank = playerCard[count].getRank();
    ++count;
   
    displayPlayerCard.setText("Your card: " + playerRank + " of " + playerSuit);
   
    if(playerValue > compValue)
    if(source == button5H)
       winnings = winnings + 5;
    else
      if(source == button10H)
        winnings = winnings + 10;
      else
         if(source == button5L)
           winnings = winnings - 5;
         else
           winnings = winnings - 10;
    else
      if(playerValue < compValue)
        if(source == button5H)
       winnings = winnings - 5;
        else
       if(source == button10H)
          winnings = winnings - 10;
       else
          if(source == button5L)
          winnings = winnings + 5;
          else
          winnings = winnings + 10;
      else
      if(source == button5L || source == button5H)
          winnings = winnings - 5;
      else
          winnings = winnings - 10;
    if(winnings <= 0)
    {
      msg = "You lose - game over";
      count = CARDS_EACH;
    }
    else
      if(winnings >= 100)
      {
         msg = "You win! Total winnings = $" + winnings;
         count = CARDS_EACH;
      }
      else
      {
          msg = "Your new total is $" + winnings;
      }
      result.setText(msg);
     }
     else
     {
       buttonOK.setEnabled(false);
       button5H.setEnabled(true);
       button10H.setEnabled(true);
       button5L.setEnabled(true);
       button10L.setEnabled(true);
       if(count < CARDS_EACH)
       {
         compValue = computerCard[count].getValue();
         compSuit = computerCard[count].getSuit();
         compRank = computerCard[count].getRank();
         displayComputerCard.setText("Next computer card: " + compRank + " of " + compSuit);
         displayPlayerCard.setText("");
       }
       else
       {
          button5H.setEnabled(false);
          button10H.setEnabled(false);
          button5L.setEnabled(false);
          button10L.setEnabled(false);
          buttonOK.setEnabled(false);
      
        }
      }
      validate();   
     
   }     
}
