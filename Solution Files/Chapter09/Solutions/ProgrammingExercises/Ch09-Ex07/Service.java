public class Service
{
   private String service;
   private double price;
   private int minutes;
   Service(String s, double p, int m)
   {
      price = p;
      service = s;
      minutes = m;
   }
   public double getPrice()
   { 
      return price;
   }
   public String getService()
   {
      return service;
   }
   public int getMinutes()
   {
      return minutes;
   }
}
