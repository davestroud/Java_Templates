import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class RWBApplet extends JApplet implements ActionListener
{	
   JLabel prompt = new JLabel("Enter your color choice ");
   JTextField userColor = new JTextField(10);
   JButton pressButton = new JButton("Press when ready");
   String[] colors = {"red", "white", "blue"};
   JLabel error = new JLabel("                       ");
   Container con = getContentPane();
   final int DUMMY = 999;

   public void init()
   {
      con.setLayout(new FlowLayout());
      con.add(prompt);  
      con.add(userColor);
      con.add(pressButton);
      con.add(error);
      pressButton.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      int whichColor = DUMMY;
      error.setText("                        ");
      for(int x = 0; x < colors.length; ++x)	
      {
         if(userColor.getText().equals(colors[x]))
 	   whichColor = x;
      }
      try
      {
	 if(whichColor == DUMMY)
	    throw(new Exception());
	 if(whichColor == 0)
	    con.setBackground(Color.red);
	 else if(whichColor == 1)
	    con.setBackground(Color.white);
	 else con.setBackground(Color.blue);
     }
     catch(Exception e1)
     {
	error.setText("No such color available");
     }
  }
}