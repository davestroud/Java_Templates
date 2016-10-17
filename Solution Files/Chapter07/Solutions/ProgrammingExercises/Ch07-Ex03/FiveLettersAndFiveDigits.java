import java.util.*;
public class FiveLettersAndFiveDigits
{
  public static void main(String[] args)
  {
     String aString;
     int stringLength;
     final int NUM = 5;
     int digitCount = 0;
     int letterCount = 0;
     Scanner in = new Scanner(System.in);
     int numSpaces = 0;
     System.out.print("Enter a string >> ");
     aString = in.nextLine();
     stringLength = aString.length();

     for(int i = 0; i < stringLength; i++)
     {
        char ch = aString.charAt(i);
        if(Character.isDigit(ch))
           digitCount++;
        else
           if(Character.isLetter(ch))
             letterCount++;
     }
     if(digitCount >= NUM && letterCount >= NUM)
        System.out.println("The string has at least " + NUM + " letters and " + NUM + " digits");
     else
     {
        System.out.println("The string did not have enough of the following:");
        if(digitCount < NUM)
           System.out.println("digits");
        if(letterCount < NUM)
           System.out.println("letters");
      }
  }
}