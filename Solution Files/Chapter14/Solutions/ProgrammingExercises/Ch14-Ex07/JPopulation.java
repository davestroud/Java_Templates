import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPopulation extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JLabel cityLabel = new JLabel("Select U.S. Cities");
   JComboBox<String> cityBox = new JComboBox<String>();
   JTextField cityPop = new JTextField(25);
   String[] cities = {"Atlanta", "Birmingham", "Boston", "Cleveland", "Chicago", "Detroit", "New York City"};
   String[] pops = {"432,000", "212,000", "625,000", "394,000", "2,700,000", "706,000", "8,000,000"};
   String myCity;
   String output;
   int cityNum;
   public JPopulation()
   {
      super("Cities");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      cityBox.addItemListener(this);
      for(int x = 0; x < cities.length; ++x)
            cityBox.addItem(cities[x]);
      add(cityLabel);
      add(cityBox);
      add(cityPop);
   }
   public static void main(String[] arguments)
   {
      JPopulation pframe = new JPopulation();
      pframe.setSize(400, 150);
      pframe.setVisible(true);
   }
   public void itemStateChanged(ItemEvent list)
   {
      Object source = list.getSource();
      if(source == cityBox)
      {
         cityNum = cityBox.getSelectedIndex();
         myCity = cities[cityNum];
         output = "The population of " + myCity + " is " + pops[cityNum];
         cityPop.setText(output);
      }
   }
}