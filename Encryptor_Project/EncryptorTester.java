import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.AccessMode.*;

public class EncryptorTester {

  public static void main(String[] args) {

    Path keywordFile =
      Paths.get("//Users//davidstroud//Java_Templates//Encryptor_Project//keyword.txt");
    Path inputFile =
      Paths.get("//Users//davidstroud//Java_Templates//Encryptor_Project//input.txt");
    byte[] data = s.getBytes();

    OutputStream output = null;
    try
    {
      output = new BufferedOutputStream(Files.newOutputStream(keywordFile, READ));
      output = new BufferedOutputStream(Files.newOutputStream(inputFile, READ));
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
