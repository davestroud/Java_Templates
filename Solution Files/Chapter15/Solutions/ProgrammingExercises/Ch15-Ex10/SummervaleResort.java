import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SummervaleResort extends JFrame implements ActionListener
{
   JMenuBar mainBar = new JMenuBar();
   JMenu menu1 = new JMenu("File");
   JMenu menu2 = new JMenu("Rooms");
   JMenu menu3 = new JMenu("Dining");
   JMenu menu4 = new JMenu("Activities");
   JMenuItem exit = new JMenuItem("Exit");
   JMenuItem suite = new JMenuItem("Suite");
   JMenuItem single = new JMenuItem("Single");
   JMenuItem breakfast = new JMenuItem("Breakfast");
   JMenuItem lunch = new JMenuItem("Lunch");
   JMenuItem dinner = new JMenuItem("Dinner");
   JMenuItem swimming = new JMenuItem("Swimming");
   JMenuItem waterskiing = new JMenuItem("Water skiing");
   JMenuItem tennis = new JMenuItem("Tennis");
   JLabel label1 = new JLabel("    Summervale Resort    ");
   JLabel lineLabel = new JLabel("------------------------------");
   JLabel label2 = new JLabel();
   public SummervaleResort()
   {
      setTitle("Summervale Resort");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      setJMenuBar(mainBar);
      mainBar.add(menu1);
      mainBar.add(menu2);   
      mainBar.add(menu3);
      mainBar.add(menu4);
      menu1.add(exit);
      menu2.add(suite);
      menu2.add(single);
      menu3.add(breakfast);
      menu3.add(lunch);
      menu3.add(dinner);
      menu4.add(swimming);
      menu4.add(waterskiing);
      menu4.add(tennis);
      exit.addActionListener(this);
      suite.addActionListener(this);
      single.addActionListener(this);
      breakfast.addActionListener(this);
      lunch.addActionListener(this);
      dinner.addActionListener(this);
      swimming.addActionListener(this);
      waterskiing.addActionListener(this);
      tennis.addActionListener(this);
      add(label1);
      label1.setFont(new Font("Arial", Font.BOLD, 16));
      lineLabel.setFont(new Font("Arial", Font.BOLD, 20));
      add(lineLabel);
      add(label2);
      label2.setFont(new Font("Arial", Font.ITALIC, 16));
   }
   public void actionPerformed(ActionEvent e)
   {
       Object source = e.getSource();
       String text = "  ";
       if(source == exit)
         System.exit(0);
       else if(source == suite)
          text = "Lovely 3-room suites from $189 per night";
       else if(source == single)
          text = "Single rooms with private bath from $99 per night";
       else if(source == breakfast)
           text = "Breakfast served 7 am until 11 am";
       else if(source == lunch)
          text = "Lunch served from 11 am until 3 pm";
       else  if(source == dinner)
          text = "Four course dinners from 5 pm until 10 pm";
       else  if(source == swimming)
          text = "Two pools and a beautiful sand beach";
       else  if(source == waterskiing)
          text = "Water skiing lessons available June through September";
       else  
          text = "Tennis lessons available year round";
       label2.setText(text);
   }
 
  public static void main(String[] args)
  {
    SummervaleResort frame = new SummervaleResort();
    final int WIDTH = 400;
    final int HEIGHT = 150;
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);
  }
}
