import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class PathDemo5 {

  public static void main(String[] args) {

    Path filePath =
      Paths.get("//Users//davidstroud//Java_Templates//FileOperations//Owners.txt");
    try {
      BasicFileAttributes attr =
        Files.readAttributes(filzzzzePath, BasicFileAttributes.class);
        System.out.println("Creation time" + attr.creationTime());
        System.out.println("Last modified time " + attr.lastModifiedTime());
        System.out.println("Size " + attr.size());
    }
    catch(IOException e)
    {
      System.out.println("IO Exception");
    }
  }
}
