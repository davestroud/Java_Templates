// SevenDaySubscriber.java
// Chapter 11, Exercise 6
public class SevenDaySubscriber extends NewspaperSubscriber
{
   String subType;
   public SevenDaySubscriber() 
   {
      super();
      setType();
   }
   public void setType()
   {
      subType = "Seven day";
   }
   public void setRate()
   {
      rate = 4.5;
   }
   public String toString()
   {
      return(address + " rate: " + rate +
         " service type : " + subType);
   }
}
