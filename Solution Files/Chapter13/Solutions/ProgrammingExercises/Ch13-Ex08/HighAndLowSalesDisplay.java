import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class HighAndLowSalesDisplay
{
   public static void main(String[] args)
   {
      Path higherFile =
         Paths.get("C:\\Java\\Chapter.13\\HighSales.txt");
      Path lowerFile =
         Paths.get("C:\\Java\\Chapter.13\\LowSales.txt");
      String s = "";

      try
      {
         InputStream higher = new BufferedInputStream(Files.newInputStream(higherFile));
         BufferedReader higherReader = new BufferedReader(new InputStreamReader(higher));
         InputStream lower = new BufferedInputStream(Files.newInputStream(lowerFile));
         BufferedReader lowerReader = new BufferedReader(new InputStreamReader(lower));
         System.out.println("\nLower Sales\n");
         s = lowerReader.readLine();
         while( s != null)
         {
            display(s);
            s = lowerReader.readLine();   
         }
         System.out.println("\nHigher Sales\n");
         s = higherReader.readLine();
         while( s != null)
         {
            display(s);
            s = higherReader.readLine();   
         }         
         lowerReader.close();
         higherReader.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
   public static void display(String s)
   {
      String[] array = new String[4];
      String delimiter = ",";
      String stringId;
      String firstName;
      String lastName;
      int sales;
      int neededSales;
      final int CUTOFF = 1000;
      array = s.split(delimiter);
      stringId = array[0];
      firstName = array[1];
      lastName = array[2];
      sales = Integer.parseInt(array[3]);
      neededSales = sales - CUTOFF;
      System.out.println("ID #" + stringId + "  " + firstName + "  " +
         lastName + "  $" + sales +  " in sales   $" + neededSales +
         " over/under cutoff");
   }
}