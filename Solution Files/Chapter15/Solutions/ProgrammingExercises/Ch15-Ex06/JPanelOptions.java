import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPanelOptions extends JPanel
{
   Color back;
   Color fore;
   String str;
   Font fnt = new Font("Ariel", Font.BOLD, 20);
   JLabel label = new JLabel();
   public JPanelOptions(Color b, Color f, String s)
   {
      str = s;
      back = b;
      fore = f;
      this.add(label);
      label.setText(s);
      label.setFont(fnt);
      this.setBackground(b);
      label.setForeground(f);
   }
}