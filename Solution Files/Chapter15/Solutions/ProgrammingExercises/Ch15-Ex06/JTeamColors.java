import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JTeamColors extends JFrame
{
   Container con = null;
   JPanelOptions p1 = new JPanelOptions(Color.ORANGE, Color.BLACK,"Tigers");
   JPanelOptions p2 = new JPanelOptions(Color.GRAY, Color.RED,"Wolves");
   JPanelOptions p3 = new JPanelOptions(Color.YELLOW, Color.GREEN,"Packers");
   JPanelOptions p4 = new JPanelOptions(Color.BLUE, Color.ORANGE,"Bears");

   public JTeamColors()
   {
      con = this.getContentPane();
      con.setLayout(new GridLayout(2,2));
      con.add(p1);
      con.add(p2);
      con.add(p3);
      con.add(p4);
      setSize(250, 250);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String args[])
   {
      JTeamColors app = new JTeamColors();
      app.setVisible(true);
      app.setSize(240, 240);
   }
}
   

