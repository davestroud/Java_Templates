// PartTime.java
// Chapter 11, Exercise 13
public class PartTime extends Student
{
   private final int FEE = 200;
   private int tuition;
   private int credits;

   public PartTime(String n, boolean f, int c)
   {
      super(n, f);
      credits = c;
   }

   public void figureTuition()
   {
      tuition = credits * FEE;
      System.out.println(this.getName() + "'s tuition is $"+tuition);
   }
}
