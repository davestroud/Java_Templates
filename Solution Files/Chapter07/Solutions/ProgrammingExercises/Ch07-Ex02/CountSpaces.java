public class CountSpaces
{
  public static void main(String[] args)
  {
     String aString = 
       "The person who says something is impossible should not interrupt the person who is doing it.”";
     int numSpaces = 0;
     int stringLength = aString.length();

     for(int i = 0; i < stringLength; i++)
     {
        char ch = aString.charAt(i);
        if(ch == ' ')
           numSpaces++;
     }
     System.out.println("The number of spaces is " + numSpaces);
  }
}