import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.AccessMode.*;

public class Encryptor {

  public static void main(String[] args) {

    Path filePath1 =
      Paths.get("//Users//davidstroud//Java_Templates//Encryptor_Project//keyword.txt");
    String s = "TROYONLINE";
    byte[] data = s.getBytes();
    OutputStream output = null;
    try
    {
      output = new BufferedOutputStream(Files.newOutputStream(filePath1, CREATE));
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
