public class DigitalCamera
{
   private String brand;
   private int megapixels;
   private double price;
   private static final int MAX_MEGAPIXELS = 10;
   private final int SALE_CUTOFF = 6;
   private final int HIGH_PRICE = 129;
   private final double LOW_PRICE = 99;
   public DigitalCamera(String brand, int res)
   {
      this.brand = brand;
      if(res > MAX_MEGAPIXELS)
         megapixels = MAX_MEGAPIXELS;
      else
         megapixels = res;
      if(megapixels <= SALE_CUTOFF)
         price = LOW_PRICE;
      else
         price = HIGH_PRICE;
   }
   public void display()
   {
      System.out.println("Camera brand: " + brand +
         " resolution: " + megapixels + " megapixels   Sale price $" + price);
   }
}