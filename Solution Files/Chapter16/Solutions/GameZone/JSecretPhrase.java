import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSecretPhrase extends JFrame implements ActionListener
{
    final int NUM = 26;
    JLabel greeting = new JLabel("Secret Phrase Game");
    JLabel promptLabel = new JLabel("Choose one button");
    Font headlineFont = new Font("Arial", Font.BOLD, 30);
    Font mediumFont = new Font("Arial", Font.BOLD, 18);
    JButton[] button = new JButton[NUM];
    String[] letter = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
       "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
       "V", "W", "X", "Y", "Z"};
    JLabel resultsLabel = new JLabel("");
    JLabel result1 = new JLabel();
    JLabel result2 = new JLabel();
    JLabel result3 = new JLabel();
    JLabel result4 = new JLabel();
    Container con = getContentPane();
    int playerCount = 0;
    int computerCount = 0;
    int tieCount = 0;
    String[] targetPhrases = {"The Wizard of Oz", "Gone With The Wind", "Casablanca",
       "Chicago", "Top Hat", "White Christmas", "The Sound of Music", "Guys and Dolls",
       "Its a Mad Mad Mad Mad World", "Defending Your Life"};
    String displayPhrase = "";
    String target;
    String buildDisplayPhrase;
    String prompt;
    String play = "  Play our game - guess the phrase  ";
    String enterOne = "  Enter one letter  ";
    String sorry = "  Sorry - not in the phrase: ";
    String correct = "  Correct!                   ";
    String userResponse;
    char guess;
    char oneLetter;
    boolean found = false;
    int position;
    int oldPos = 0;
    int x;
    int random;
    int len;
    public JSecretPhrase()
    {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       greeting.setFont(headlineFont);
       result1.setFont(headlineFont);
       promptLabel.setFont(mediumFont);
       con.add(greeting);
       con.add(promptLabel);
       con.add(resultsLabel);
       con.add(result1);
       for(x = 0; x < NUM; ++x)
       {
          button[x] = new JButton(letter[x]);
       }
             
       con.add(result2);
       con.add(result3);
       con.setLayout(new FlowLayout());
       for(x = 0; x < NUM; ++x)
       {
          con.add(button[x]);
          button[x].addActionListener(this);
       }
       
       random = (int) (Math.random() * 100) % targetPhrases.length;
       target = targetPhrases[random];
       target = target.toUpperCase();
    
       len = target.length();
       x = 0;
       while(x < len)
       {
         if(target.charAt(x) == ' ')
             displayPhrase = displayPhrase + ' ';
         else
             displayPhrase = displayPhrase + "*";
         ++x;
      }
      result1.setText(displayPhrase);
      promptLabel.setText(play + enterOne);                                       
    }
    public void actionPerformed(ActionEvent e)
    {
      int pos;
      JButton temp = (JButton)e.getSource();
      guess = temp.getText().charAt(0);
      for(pos = 0; pos < NUM; ++pos)
      {
          if(guess == letter[pos].charAt(0))
          {
              x = pos;
              pos = NUM;
          }
      }
      button[x].setEnabled(false);
      found = false;
      for(pos = 0; pos < len; ++pos)
      {
            oneLetter = target.charAt(pos);
            if(oneLetter == guess)
            {
               displayPhrase = displayPhrase.substring(0, pos) +
                 guess + displayPhrase.substring(pos + 1, len);
               found = true;
            }      
       }
       if(!found)
       {
         prompt = sorry + guess;
       }
       else
       {
         prompt = correct + enterOne;  
       }
       result1.setText(displayPhrase);
       result2.setText(prompt);
       
       if(displayPhrase.indexOf('*') == -1)
       {
         result2.setText("");
         result3.setText(" Congratulations! ");
         for(x = 0; x < NUM; ++x)
           button[x].setEnabled(false);
       }    
      validate();   
      result1.setLocation(20, 125);  
      }
   public static void main(String[] args)        
   {
      JSecretPhrase frame = new JSecretPhrase();
      frame.setSize(500, 300);
      frame.setVisible(true);
   }
}
