public class HolidayCabinRental extends CabinRental
{
  public HolidayCabinRental(int num)
  {
    super(num);
    final int SURCHARGE = 150;
    rate += SURCHARGE;
  }
}
