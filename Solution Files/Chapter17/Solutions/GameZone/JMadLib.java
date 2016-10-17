import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMadLib extends JApplet implements ActionListener
{
    public final int WORDS = 4;
    JLabel greeting = new JLabel("Welcome to Mad Libs");
    Font headlineFont = new Font("Helvetica", Font.BOLD, 36);
    Font mediumFont = new Font("Helvetica", Font.BOLD, 24);
    JTextField answer = new JTextField(10); 
    JButton pressMe = new JButton("Press me");
    Container con = getContentPane();
    int count = 0;
    String[] prompt = {"Enter a noun",
                      "Enter another noun",
                      "Enter an adjective",
                      "Enter a past tense verb",
                      ""};
    String[] madlib = new String[WORDS];
    JLabel promptLabel = new JLabel(prompt[0]);
    public void init()
    {
       greeting.setFont(headlineFont);
       con.add(greeting);
       con.add(promptLabel);
       con.add(answer);
       con.add(pressMe);
       con.setLayout(new FlowLayout());
       pressMe.addActionListener(this);
       answer.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       madlib[count] = answer.getText();
       answer.setText("");
       ++count;
       promptLabel.setText(prompt[count]);
       validate();
       if(count == WORDS)
       {
          JLabel story1 = new JLabel("Mary had a little " + madlib[0]);
          JLabel story2 = new JLabel("Its " + madlib[1] + " was " +
             madlib[2] + " as snow");
          JLabel story3 = new JLabel("And everywhere that Mary " + madlib[3]);
          JLabel story4 = new JLabel("The " + madlib[0] + " was sure to go");
          story1.setFont(mediumFont);
          story2.setFont(mediumFont);
          story3.setFont(mediumFont); 
          story4.setFont(mediumFont);
          greeting.setText("Completed Rhyme");
          con.remove(promptLabel);
          con.remove(pressMe);
          con.remove(answer);
          con.add(story1);
          con.add(story2);
          con.add(story3);
          con.add(story4);
          validate();
       }
   }
}
