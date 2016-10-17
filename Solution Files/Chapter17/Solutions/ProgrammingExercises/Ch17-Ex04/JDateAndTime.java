import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JDateAndTime extends JApplet implements ActionListener
{
   JTextField banner = new JTextField("",20);
   Font theFont = new Font("TimesRoman",Font.BOLD, 12);
   JButton button1 = new JButton("Press");
   GregorianCalendar calendar = new GregorianCalendar();
   int hour = calendar.get(calendar.HOUR);
   int minute = calendar.get(calendar.MINUTE);
   int am = calendar.get(calendar.AM_PM);
   int month = calendar.get(calendar.MONTH)+ 1;
   int day = calendar.get(calendar.DAY_OF_MONTH);
   int year = calendar.get(calendar.YEAR);
   String ampm = "AM";

   public void init()
   {
      Container con = getContentPane();
      FlowLayout flow = new FlowLayout();
      con.setLayout(flow);
      banner.setFont(theFont);
      con.add(button1);
      con.add(banner);
      button1.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
        if (source == button1)
        {
           if(am == 1)
              ampm = "PM";
           banner.setText("Today is " + month + "/" +
              day + "/" + year + " time is " + hour +
              ":" + minute + ampm);
        }
   }
}