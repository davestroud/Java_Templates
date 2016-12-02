import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;

public class CreateOneRandomAccessRecord {

  public static void main(String[] args) {

    Path file =
      Paths.get("/Users/davidstroud/Java_Templates/FileOperations/RandomEmployees//RandomEmployees.txt");
    String s = "002,Stroud,10.40" +
      System.getProperty("line.separator");
    final int RECSIZE = s.length();
    byte[] data = s.getBytes();
    ByteBuffer buffer = ByteBuffer.wrap(data);
    FileChannel fc = null;
    try
    {
      fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
      fc.position(2 *  RECSIZE);
      fc.write(buffer);
      fc.close();
    }
    catch (Exception e)
    {
      System.out.println("Error message: " + e);
    }
  }
}
