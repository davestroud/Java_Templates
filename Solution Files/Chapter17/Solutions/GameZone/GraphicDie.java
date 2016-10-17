import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class GraphicDie extends Die
{
  public void drawDie(Graphics g, int x, int y)
  {
     final int SIZE = 80;
     final int DOT_SIZE = 15;
     int value = getValue();
     g.drawRect(x + DOT_SIZE / 2, y + DOT_SIZE / 2, SIZE, SIZE);
     if(value == 1 || value == 3 || value == 5)
        g.fillOval(x + (SIZE / 2), y + (SIZE / 2), DOT_SIZE, DOT_SIZE);
     if(value == 2 || value == 3 || value == 5)
     {
        g.fillOval(x + (SIZE / 3), y + (SIZE / 3), DOT_SIZE, DOT_SIZE);
        g.fillOval(x + 2 * (SIZE / 3), y + 2 * (SIZE / 3), DOT_SIZE, DOT_SIZE);
     }
     if(value == 4)
     {
        g.fillOval(x + (SIZE / 3), y + (SIZE / 3), DOT_SIZE, DOT_SIZE);
        g.fillOval(x + 2 * (SIZE / 3), y + (SIZE / 3), DOT_SIZE, DOT_SIZE);
        g.fillOval(x + (SIZE / 3), y + 2 * (SIZE / 3), DOT_SIZE, DOT_SIZE);
        g.fillOval(x + 2 * (SIZE / 3), y + 2 *(SIZE / 3), DOT_SIZE, DOT_SIZE);
     }
     if(value == 5)
     {
       g.fillOval(x + (SIZE / 3), y + 2 * (SIZE / 3), DOT_SIZE, DOT_SIZE);
        g.fillOval(x + 2 * (SIZE / 3), y + (SIZE / 3), DOT_SIZE, DOT_SIZE);
     }
     if(value == 6)
     {
      g.fillOval(x + (SIZE / 4), y + (SIZE / 4), DOT_SIZE, DOT_SIZE);
      g.fillOval(x + 3 * (SIZE / 4), y + (SIZE / 4), DOT_SIZE, DOT_SIZE);
      g.fillOval(x + (SIZE / 4), y + 3 * (SIZE / 4), DOT_SIZE, DOT_SIZE);
      g.fillOval(x + 3 * (SIZE / 4), y + 3 *(SIZE / 4), DOT_SIZE, DOT_SIZE);
      g.fillOval(x + (SIZE / 4), y + (SIZE / 2), DOT_SIZE, DOT_SIZE);
      g.fillOval(x + 3 * (SIZE / 4), y + (SIZE / 2), DOT_SIZE, DOT_SIZE);
     }
  }
        
}