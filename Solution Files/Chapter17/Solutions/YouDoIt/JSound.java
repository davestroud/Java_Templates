import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class JSound extends JApplet
{
   AudioClip sound;
   public void init()
   {
      sound = getAudioClip(getCodeBase(),"mysteryTune.au");
   }
   public void start()
   {
      sound.loop();  
   }
   public void stop()
   {
      sound.stop();
   }
   public void paint(Graphics g)
   {
      super.paint(g);
      Graphics2D g2D = (Graphics2D)g;
      g2D.drawString
        ("Listen to the mystery tune", 10, 10);
   }
}

