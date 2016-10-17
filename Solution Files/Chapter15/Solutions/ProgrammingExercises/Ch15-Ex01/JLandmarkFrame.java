import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLandmarkFrame extends JFrame implements ActionListener
{
   JButton northButton = new JButton("Mount Rushmore");
   JButton southButton = new JButton("The Alamo");
   JButton eastButton = new JButton("Statue of Liberty");
   JButton westButton = new JButton("Golden Gate Bridge");
   JButton centerButton = new JButton("Buckingman Fountain, Chicago");

   public JLandmarkFrame()
   {
      setTitle("JLandmark Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      add(westButton,"West");
      add(centerButton,"Center");
      add(eastButton,"East");
      add(northButton,"North");
      add(southButton,"South");
      eastButton.addActionListener(this);
      centerButton.addActionListener(this);
      westButton.addActionListener(this);
      northButton.addActionListener(this);
      southButton.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
     // no actions required
   }
   public static void main(String[] args)
   {
      JLandmarkFrame lFrame = new JLandmarkFrame();
      lFrame.setSize(520,200);
      lFrame.setVisible(true);
   }
}