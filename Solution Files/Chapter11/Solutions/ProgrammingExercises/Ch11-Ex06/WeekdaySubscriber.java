// WeekdaySubscriber.java
// Chapter 11, Exercise 6
public class WeekdaySubscriber extends NewspaperSubscriber
{
   String subType;
   public WeekdaySubscriber() 
   {
      super();
      setType();
   }
   public void setType()
   {
      subType = "Weekday";
   }
   public void setRate()
   {
      rate = 3.5;
   }
   public String toString()
   {
      return(address + " rate: " + rate +
	" service type : " + subType);
   }

}
