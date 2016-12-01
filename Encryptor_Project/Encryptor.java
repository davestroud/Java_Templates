// Perform the encryption and decryption

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class Encrypter {

  public static void main(String[] args) {

    Path file1 =
      Paths.get("Users//davidstroud//Java_Templates//Encrypter_Project//xxxx.txt");
    Path file2 =
      Paths.get("Users//davidstroud//Java_Templates//Encrypter_Project//xxxx.txt")
      try
      {
        BasicFileAttributes attr1 =
          Files.readAttributes(file1, BasicFileAttributes.class);
        BasicFileAttributes attr2 =
          Files.readAttributes(file2, BasicFileAttributes.class);
      }

  }
}
