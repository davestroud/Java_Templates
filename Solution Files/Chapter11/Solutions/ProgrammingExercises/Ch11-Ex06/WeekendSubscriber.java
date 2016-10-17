// WeekendSubscriber.java
// Chapter 101, Exercise 6
public class WeekendSubscriber extends NewspaperSubscriber
{
   String subType;
   public WeekendSubscriber() 
   {
      super();
      setType();
   }
   public void setType()
   {
      subType = "Weekend";
   }
   public void setRate()
   {
      rate = 2.00;
   }
   public String toString()
   {
      return(address + " rate: " + rate +
	 " service type : " + subType);
   }
}
