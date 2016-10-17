public class Diagonal
{
   public static void main(String[] args)
   {
      final char EX = 'X';
      final char SPACE = ' ';
      final int ROWS = 5;
      int spaces = 0;
      int a, b;
      for(a = 0; a < ROWS; ++a)
      {
         for(b = 0; b < spaces; ++b)
            System.out.print(SPACE);
         System.out.println(EX);
         spaces++;
      }
   }
}