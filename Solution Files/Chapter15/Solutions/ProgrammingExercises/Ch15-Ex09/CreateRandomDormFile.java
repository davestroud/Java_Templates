import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CreateRandomDormFile extends JFrame
  implements ActionListener
{
   private JLabel title =  
     new JLabel("Dormitory Assignments");
   Font bigFont = new Font("Helvetica", Font.ITALIC, 24);
   private JLabel prompt = 
      new JLabel("    Enter the room number    ");
   private JTextField room = new JTextField(4);
   private JTextField first = new JTextField(14);
   private JTextField last = new JTextField(14);
   private JLabel rLabel = new JLabel("Room");
   private JLabel fLabel = new JLabel("First name");
   private JLabel lLabel = new JLabel("Last name");
   private JButton enterDataButton =   
      new JButton("Enter data");
   private Container con = getContentPane();
   DataOutputStream ostream;
   RandomAccessFile dormFile;
   final int RECORD_SIZE = 24;
   final int NUM_RECORDS = 100;
   StringBuffer blankName = new StringBuffer(10);
   public CreateRandomDormFile()
   {
     super("Create File");
     try
     {
        dormFile = 
          new RandomAccessFile("RoomAssignments.dat","rw"); 
        for(int x = 0; x < NUM_RECORDS; ++x)
        {
           dormFile.writeInt(0);
           dormFile.writeUTF(blankName.toString());
           dormFile.writeUTF(blankName.toString());
        }
     }
     catch(IOException e)
     {
       System.err.println("File not opened");
       System.exit(1);
     }
     setSize(300, 200);
     con.setLayout(new FlowLayout());
     title.setFont(bigFont);
     con.add(title);
     con.add(prompt);
     con.add(rLabel);
     con.add(room);
     con.add(fLabel);
     con.add(first);
     con.add(lLabel);
     con.add(last);
     con.add(enterDataButton);
     enterDataButton.addActionListener(this);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e1)
  {
     final int MAXNUM = 99;
     int num;
     try
     {
         num = Integer.parseInt(room.getText());
         if(num > MAXNUM)
            num = MAXNUM;
         dormFile.seek((num - 1) * RECORD_SIZE);
         dormFile.writeInt(num);
         dormFile.writeUTF(first.getText());
         dormFile.writeUTF(last.getText());
         room.setText("");
         last.setText("");
         first.setText("");
      }
      catch(NumberFormatException e2)
      {
         System.err.println("Invalid room number");
      }
      catch(IOException e3)
      {
          System.err.println("Error writing file");
          System.exit(1);
      }
   }
   public static void main(String[] args)
   {
      CreateRandomDormFile file = new CreateRandomDormFile(); 
   }
}