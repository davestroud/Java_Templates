import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;
public class DisplaySelectedFirstNames
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\EmployeeList.txt");
      String[] array = new String[3];
      String s = "";
      String delimiter = ",";
      String searchName;
      boolean wasFound = false;
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         System.out.println();        

         System.out.print("Enter first name to search for >> ");
         searchName = keyBoard.nextLine();
         s = reader.readLine();
         while(s != null)
         {
            array = s.split(delimiter);
            if(searchName.equals(array[1]))
            {
               wasFound = true;
               for(int x = 0; x < array.length; ++x)
                  System.out.print(array[x] + "  ");
               System.out.println();
            }
            s = reader.readLine();           
         }
         if(!wasFound)
           System.out.println("No records found for " + searchName);
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
