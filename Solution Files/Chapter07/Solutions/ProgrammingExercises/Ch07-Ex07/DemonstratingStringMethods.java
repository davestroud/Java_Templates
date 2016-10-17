public class DemonstratingStringMethods
{
   public static void main(String[] args)
   { 
      String quote =
        "You can never cross the ocean until you have the courage to lose sight of the shore. - Christopher Columbus";

      System.out.println("index.of('v') is: " + quote.indexOf('v'));
      System.out.println("index.of('x') is: " + quote.indexOf('x'));      System.out.println("char.At(16) is: " + quote.charAt(16));
      System.out.println("endsWith(\"bus\") is: " + quote.endsWith("bus"));
      System.out.println("endsWith(\"car\") is: " + quote.endsWith("car"));
      System.out.println("replace('c', 'C') is: " + quote.replace('c', 'C'));
   }
}