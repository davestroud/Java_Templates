public class DemoCabinRental
{
  public static void main(String args[])
  {
     CabinRental lowCabin = new CabinRental(2);
     CabinRental highCabin = new CabinRental(4);
     HolidayCabinRental lowHolidayRental = new HolidayCabinRental(2);
     HolidayCabinRental highHolidayRental = new HolidayCabinRental(4);
     System.out.println("Low cabin #" + lowCabin.getCabinNumber() +
       " rate " + lowCabin.getRate());
     System.out.println("High cabin #" + highCabin.getCabinNumber() +
       " rate " + highCabin.getRate());
     System.out.println("Low holiday #" + lowHolidayRental.getCabinNumber() +
       " rate " + lowHolidayRental.getRate());
     System.out.println("High holiday #" + highHolidayRental.getCabinNumber() +
       " rate " + highHolidayRental.getRate());
   }
}
