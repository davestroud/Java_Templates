import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.AccessMode.*;

public class Test {

  public static void main(String[] args) {

    Path inputFile =
      Paths.get("//Users//davidstroud//Java_Templates//Encryptor_Project//play.txt");
    String s = "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG";


    byte[] data = s.getBytes();

    OutputStream output = null;
    try
    {
      output = new BufferedOutputStream(Files.newOutputStream(inputFile, CREATE));
      output.write(data);
      output.flush();
      output.close();
    }
    catch(Exception e)
    {
      System.out.println("Message: " + e);
    }
  }
}
