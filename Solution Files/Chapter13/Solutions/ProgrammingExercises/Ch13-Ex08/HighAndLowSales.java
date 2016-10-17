import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class HighAndLowSales
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      Path higherFile =
         Paths.get("C:\\Java\\Chapter.13\\HighSales.txt");
      Path lowerFile =
         Paths.get("C:\\Java\\Chapter.13\\LowSales.txt");
      String s = "";
      String delimiter = ",";
      String stringId;
      String firstName;
      String lastName;
      int sales;
      final String QUIT = "ZZZ";
      final int CUTOFF = 1000;
      try
      {
         OutputStream higher = new BufferedOutputStream(Files.newOutputStream(higherFile, CREATE));
         BufferedWriter higherWriter = new BufferedWriter(new OutputStreamWriter(higher));
         OutputStream lower = new BufferedOutputStream(Files.newOutputStream(lowerFile, CREATE));
         BufferedWriter lowerWriter = new BufferedWriter(new OutputStreamWriter(lower));
         System.out.print("Enter employee ID >> ");
         stringId = kb.nextLine();
         while(!stringId.equals(QUIT))
         {
            System.out.print("Enter firstName >> ");
            firstName = kb.nextLine();
            System.out.print("Enter last name >> ");
            lastName = kb.nextLine();
            System.out.print("Enter sales >> ");
            sales = kb.nextInt();
            kb.nextLine();  
            s = stringId + delimiter + firstName + delimiter +
               lastName + delimiter + sales + System.getProperty("line.separator");
            if(sales < CUTOFF)
               lowerWriter.write(s, 0, s.length());
            else
               higherWriter.write(s, 0, s.length());  
            System.out.print("Enter next employee ID  or " + QUIT + " to quit >> ");
            stringId = kb.nextLine();
         }
         lowerWriter.close();
         higherWriter.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
}
