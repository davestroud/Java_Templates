import java.util.Scanner;
public class CollegeCost
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int COLLEGE_AGE = 18;
      int age;
      int cost;
      int perYear;
      System.out.print("Enter child's current age >> ");
      age = input.nextInt();
      while(age > COLLEGE_AGE)
      {
         System.out.println("Age cannot be greater than " + COLLEGE_AGE);
         System.out.print("Enter child's current age >> ");
         age = input.nextInt();
      }         
      System.out.print("Enter estimated college cost (in whole dollars) at age " +
         COLLEGE_AGE + " >> ");
      cost = input.nextInt();
      perYear = cost / (COLLEGE_AGE - age); 
      System.out.println("You must save approximately $" + perYear + " per year");
   }
}

