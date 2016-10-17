import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTunes2 extends JFrame implements ItemListener
{
   JComboBox<String> songBox = new JComboBox<String>();
   JLabel songList = new JLabel("Song List");
   JLabel aSong = new JLabel("JTunes");
   JTextField priceField = new JTextField(16);
   double[] songPrice = {0.00, 0.99, 1.19, 1.09, 1.39,
      1.59, 1.49, 1.29, 0.79, 0.69, 1.79, 0.89, 1.69};
   String output;
   public JTunes2()
   {
      super("JTunes Song List");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(aSong);
      songBox.addItemListener(this);
      add(songList);
      songBox.addItem("none");
      songBox.addItem("Ain't No Sunshine");
      songBox.addItem("Big Girls Dont Cry");
      songBox.addItem("Black Bird");
      songBox.addItem("Boom Boom Pow");
      songBox.addItem("Don't Stop Believin'");
      songBox.addItem("I Gotta Feeling");
      songBox.addItem("Layla");
      songBox.addItem("Party in the U.S.A.");
      songBox.addItem("Poker Face");
      songBox.addItem("So What");
      songBox.addItem("Stairway to Heaven");
      songBox.addItem("White Room");
      add(songBox);
      add(priceField);
      songBox.setEditable(true);
   }
   public static void main(String[] arguments)
   {
      JTunes2 frame = new JTunes2();
      frame.setSize(250,150);
      frame.setVisible(true);
   }
   public void itemStateChanged(ItemEvent list)
   {
      Object source = list.getSource();
      if(source == songBox)
      {
         int num = songBox.getSelectedIndex();
         try
         {
            output = "Song Price $" + songPrice[num];
            priceField.setText(output);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
             priceField.setText("Sorry - we don't have that song");
         }

      }
   }
}