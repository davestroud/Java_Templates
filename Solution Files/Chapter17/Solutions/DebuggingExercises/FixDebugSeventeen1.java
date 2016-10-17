// Personality test
// tells your personality
// based on favorite color
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class FixDebugSeventeen1 extends JApplet implements ActionListener
{
   Label question = new Label("What's your favorite color?");
   TextField response = new TextField(4);
   Button pressButton = new Button("Press");
   Label profile = new Label("Personality profile will show up here");
   String letterResponse;
   public void init()
   {
      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      con.add(question);
      con.add(response);
      con.add(pressButton);
      pressButton.addActionListener(this);
      con.add(profile);
   }

   public void actionPerformed(ActionEvent e)
   {
      String color = response.getText();
      if(color.equals("red"))
      {
         profile.setText("Hot tempered  ");
         profile.setBackground(Color.RED);
      }
      else
         if(color.equals("blue"))
         {
            profile.setText("Serene");
            profile.setBackground(Color.BLUE);
         }
         else
         {
            profile.setText("Very friendly ");
            profile.setBackground(Color.YELLOW);
         }
   }
}