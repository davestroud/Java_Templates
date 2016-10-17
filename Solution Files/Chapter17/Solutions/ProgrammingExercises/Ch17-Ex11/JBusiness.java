import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class JBusiness extends JApplet implements ActionListener 
{
   JLabel headLabel = new JLabel
     ("Let Business Associates take care of your business");
   JLabel listenLabel = new JLabel("Listen to our theme");
   JButton playButton = new JButton("Play");
   JButton stopButton = new JButton("Stop");
   AudioClip music;
   public void init()
   {
      Container con = getContentPane();
      con.setLayout (new FlowLayout());
      con.add(headLabel);
      con.add(listenLabel); 
      con.add(playButton);
      con.add(stopButton);
      playButton.addActionListener(this);
      stopButton.addActionListener(this);
      music = getAudioClip(getCodeBase(),"business.mid");
   }
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == playButton)
         music.loop();
      else
         music.stop();
   }
}