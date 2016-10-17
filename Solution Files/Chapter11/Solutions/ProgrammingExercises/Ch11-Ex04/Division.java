// Division.java
// Chapter 11, Exercise 4
public abstract class Division
{
   protected String divisionTitle;
   protected int acctNum;
   public Division(String title, int acct)
   {
      divisionTitle = title;
      acctNum = acct;
   }
   public abstract void display();
}

