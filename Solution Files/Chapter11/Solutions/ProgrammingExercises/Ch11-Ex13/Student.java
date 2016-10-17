// Student.java
// Chapter 11, Exercise 13
public abstract class Student
{
   protected String name;
   protected boolean fullTime;

   public  Student(String n, boolean f)
   {
      name = n;
      fullTime = f;
   }

   public String getName()
   {
      return name;
   }

   public void getStatus()
   {
      if(fullTime)
         System.out.println("This student is full time");
      else
         System.out.println("This student is part time");
   }

   public abstract void figureTuition( );
}
