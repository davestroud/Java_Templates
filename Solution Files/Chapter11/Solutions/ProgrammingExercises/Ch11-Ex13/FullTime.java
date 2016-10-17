// FullTime.java
// Chapter 11, Exercise 13
public class FullTime extends Student
{
   final int TUITION = 2000;
   public FullTime(String n, boolean f)
   {
      super(n, f);
   }

   public void figureTuition()
   {
      System.out.println(this.getName() + "'s tuition is $" + TUITION);
   }
}
