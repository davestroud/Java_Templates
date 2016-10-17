import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCurrencies extends JFrame
{
    double usDollars;
    double cubanPesos;
    double frenchFrancs;
    String usDollarString;
    int vertPos = 35;
    final int GAP = 20;
    final double CUBAN_PESO = 22.2;
    final double FRENCH_FRANC = 5.2;
    public JCurrencies()
    {
       usDollarString = JOptionPane.showInputDialog(null, "Enter an amount n U.S. dollars");
       usDollars = Double.parseDouble(usDollarString);
       frenchFrancs = usDollars * FRENCH_FRANC;
       cubanPesos = usDollars * CUBAN_PESO;
    }
    public void paint(Graphics pen)
    {
       super.paint(pen);
       Graphics2D newpen = (Graphics2D)pen;

       newpen.drawString("In U.S. dollars:  " + usDollars, 45, vertPos += GAP);
       newpen.drawString("In Cuban pesos:   " + cubanPesos, 45, vertPos += GAP);
       newpen.drawString("In French francs: " + frenchFrancs, 45, vertPos += GAP);
    }
    public static void main(String[] args)
    {
       JCurrencies frame = new JCurrencies();
       frame.setSize(300, 200);
       frame.setVisible(true);
   }
}
