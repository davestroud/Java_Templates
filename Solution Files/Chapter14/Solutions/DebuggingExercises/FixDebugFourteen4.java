// Beverage selector
// Milk and cola are $2
// all other drinks are $1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FixDebugFourteen4 extends JFrame implements ItemListener
{
  FlowLayout flow = new FlowLayout();
  String title = new String("Beverage Selector");
  Font bigFont = new Font("Arial", Font.PLAIN, 24);
  ButtonGroup drinkGrp = new ButtonGroup();
  JCheckBox cola = new JCheckBox("Cola",false);
  JCheckBox lemon = new JCheckBox("Lemonade",false);
  JCheckBox tea = new JCheckBox("Iced tea");
  JCheckBox milk = new JCheckBox("Milk");
  JCheckBox coffee = new JCheckBox("Coffee");
  JTextField totPrice = new JTextField(10);
  String output;
  int totalPrice = 0;
  public FixDebugFourteen4()
  {
    super("Beverage Selector");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(flow);
    add(cola);
    cola.addItemListener(this);
    add(lemon);
    lemon.addItemListener(this);
    add(tea);
    tea.addItemListener(this);
    add(milk);
    milk.addItemListener(this);
    add(coffee);
    add(totPrice);
    coffee.addItemListener(this);
    drinkGrp.add(cola);
    drinkGrp.add(lemon);
    drinkGrp.add(tea);
    drinkGrp.add(milk);
    drinkGrp.add(coffee);
    totPrice.setText("0");
  }
  public static void main(String[] arguments)
  {
    JFrame bFrame = new FixDebugFourteen4();
    bFrame.setSize(350, 100);
    bFrame.setVisible(true);
  } 
  public void itemStateChanged(ItemEvent check)
  {
   Object source = check.getItem();
   if(source == cola)
   {
     int select = check.getStateChange();
     if(select == ItemEvent.SELECTED)
       totalPrice += 2;
     else if(select == ItemEvent.DESELECTED)
     totalPrice -= 2;
     output = " " + totalPrice;
     totPrice.setText(output);
   }
   if(source == lemon)
   {
     int select = check.getStateChange();
     if(select == ItemEvent.SELECTED)
       totalPrice += 1;
     else if(select == ItemEvent.DESELECTED)
   	totalPrice -= 1;
     output = " " + totalPrice;
     totPrice.setText(output);
   }
   if(source == tea)
   {
     int select = check.getStateChange();
     if(select == ItemEvent.SELECTED)
       totalPrice += 1;
     else if(select == ItemEvent.DESELECTED)
   	totalPrice -= 1;
     output = " " + totalPrice;
     totPrice.setText(output);
   }
   if(source == milk)
   {
     int select = check.getStateChange();
     if(select == ItemEvent.SELECTED)
       totalPrice += 2;
     else if(select == ItemEvent.DESELECTED)
     totalPrice -= 2;
     output = " " + totalPrice;
     totPrice.setText(output);
    }
    if(source == coffee)
    {
      int select = check.getStateChange();
      if(select == ItemEvent.SELECTED)
         totalPrice += 1;
      else if(select == ItemEvent.DESELECTED)
         totalPrice -= 1;
      output = " " + totalPrice;
      totPrice.setText(output);
    }
  }
}