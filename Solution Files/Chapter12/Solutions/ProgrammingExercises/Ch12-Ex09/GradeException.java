public class GradeException extends Exception
{
   public static final char[] validGrade = 
      {'A', 'B', 'C', 'D', 'F', 'I'};
   public GradeException(String string)
   {
      super(string);
   }
}