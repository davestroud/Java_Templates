import java.nio.file.*;
import java.io.IOException;
public class SameFolder
{
   public static void main(String[] args)
   {
      Path file1 =
         Paths.get("C:\\Java\\Chapter.12\\TestData1.txt");
       Path file2 =
         Paths.get("C:\\Java\\Chapter.13\\TestData2.txt");
      boolean foldersAreSame = true;
      try
      {
         int count1 = file1.getNameCount();
         int count2 = file2.getNameCount();
         System.out.println("Path for file1 is " + file1.toString());
         System.out.println("Path for file2 is " + file2.toString());
         for(int x = 0; x < count1 - 1; ++x)
            if(!(file1.getName(x).equals(file2.getName(x))))
               foldersAreSame = false;
         if(foldersAreSame)
               System.out.println("Files are in the same folder");
         else
               System.out.println("Files are not in the same folder");      
      }
      catch(Exception e)
      {
          System.out.println("IO Exception");
      }
   }
}
