import java.util.*;
public class CountMatches
{
  public static void main(String[] args)
  {
     String firstStr;
     String secondStr;
     String foundStr = "";
     int firstLength;
     int secondLength;
     boolean isMatch;
     boolean isFirstMatch;
     int matches = 0;
     int x, y;
     int total;
     char ch1;
     char ch2;
     Scanner in = new Scanner(System.in);
     System.out.print("Enter a string >> ");
     firstStr = in.nextLine();
     System.out.print("Enter another string >> ");
     secondStr = in.nextLine();
     firstLength = firstStr.length();
     secondLength = secondStr.length();
     total = firstLength + secondLength;
     for(x = 0; x < firstLength; x++)
     {
        ch1 = firstStr.charAt(x);
        isMatch = false;
        isFirstMatch = true;
        for(y = 0; y < secondLength; y++)
        {
           ch2 = secondStr.charAt(y);
           if(ch1 == ch2)
           {
              isMatch = true;
              if(isFirstMatch)
              {
                 foundStr += " " + ch1;
                 isFirstMatch = false;
              }
           }
        }
        if(isMatch)
          ++matches;
     }
     System.out.println(matches + " characters in " + firstStr +
        " are also found in " + secondStr);
     System.out.println("The characters in " + firstStr +
        " that are also in " + secondStr + " are as follows: ");
     System.out.println(foundStr);
  }
}