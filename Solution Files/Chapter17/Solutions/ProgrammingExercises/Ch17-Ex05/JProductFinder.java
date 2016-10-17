import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JProductFinder extends JApplet implements ActionListener
{
   JLabel banner = new JLabel("Enter a product number: ");
   JTextField productField = new JTextField("", 5);
   JButton button1 = new JButton("Enter");
   JLabel result = new JLabel("");
   Font bigFont = new Font("TimesRoman",Font.BOLD, 16);
   FlowLayout flow = new FlowLayout();
   Container con = getContentPane();

   public void init()
   {
      con.setLayout(flow);
      con.add(banner);
      con.add(productField);
      con.add(button1);
      button1.addActionListener(this);
      productField.requestFocus();
   }

   public void actionPerformed(ActionEvent e)
   {
      boolean match = false;
      Object source = e.getSource();
      int x = 0;
      int i;
      if(source == button1)
      {
         result.setFont(bigFont);
         String[][] products =
            {  {"111", "cotton shirt", "29.99"},
               {"113", "denim skirt", "39.99"},
               {"114", "wool jacket", "79.99"},
               {"117", "boot cut jeans", "32.88"},
               {"119", "leather jacket", "159.95"}
            };

         for(i = 0; i < 5; i++)
         {
            if(productField.getText().equalsIgnoreCase(products[i][0]))
            {
                match = true;
                x = i;
                i = products.length;
            }
         }
         if(match)
            result.setText("Product #: " + products[x][0] +
               "    " + products[x][1] + " $" + products[x][2]);
         else
            result.setText("Sorry - no Match for #" +
              productField.getText());
         con.add(result);
         invalidate();
         validate();
      }
   }
}