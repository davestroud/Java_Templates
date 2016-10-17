import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class JCarlys extends JApplet implements ActionListener 
{
   private ImageIcon image = new ImageIcon("fireworks.gif");
   private int width, height;
   int x = 20;
   int y = 90;
   JLabel headLabel = new JLabel
     ("Carly's Catering");
   JLabel listenLabel = new JLabel("Listen to our theme");
   JButton playButton = new JButton("Play");
   JButton stopButton = new JButton("Stop");
   AudioClip music;
   Font theFont = new Font("TimesRoman",Font.BOLD, 18);
   public void init()
   {
      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      con.add(headLabel);
      headLabel.setFont(theFont);
      con.add(listenLabel); 
      con.add(playButton);
      con.add(stopButton);
      playButton.addActionListener(this);
      stopButton.addActionListener(this);
      music = getAudioClip(getCodeBase(),"moving_on_up.mid");
      width = image.getIconWidth();
      height = image.getIconHeight();
   }
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == playButton)
         music.loop();
      else
         music.stop();
   }
   public void paint(Graphics g)
   {
      super.paint(g);
      g.drawImage(image.getImage(), x, y, width, height, this);
   }
}