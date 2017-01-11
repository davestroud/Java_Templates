import java.util.Scanner;
public class CompareStrings {
  public static void main(String[] args) {
    String aName = "David";
    String anotherName;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name > ");
    anotherName = input.nextLine();
    if (aName.equals(anotherName))
      System.out.println(aName + " equals " + anotherName);
    else
      System.out.println(aName + " does not equal " + anotherName);

      // Both initialized to the same value
      // Therefore, only stored once in memory
      // They are equal because they are stored in same memory
      String firstString = "abc";
      String secondString = "abc";
      if (firstString == secondString)
        System.out.println("Strings are the same");

      // Test to determine which string has a higher
      // lexicographical comparison
      String aWord = "hamster";
      if (aWord.compareTo("iguana") < 0)
        System.out.println("Is greater");
      else
        System.out.println("It is not greater");
      }
}
