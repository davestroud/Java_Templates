public class ThrowProductException
{
   public static void main(String[] args)
   {
      String num;
      double price;
      try
      {
         num = "456";
         price = 88.99;
         Product first = new Product(num, price);
         System.out.println("Product #" + num + " is ok");
      }
      catch(ProductException error)
      {
         System.out.println("Product Error: " + error.getMessage());
      }
      try
      {   
         num = "7862";
         price = 5.99;
         Product second = new Product(num, price);
         System.out.println("Product #" + num + " is ok");
      }
      catch(ProductException error)
      {
         System.out.println("Product Error: " + error.getMessage());
      }
      try
      {
         num = "782";
         price = 0;
         Product third = new Product(num, price); 
         System.out.println("Product #" + num + " is ok");
      }
      catch(ProductException error)
      {
         System.out.println("Product Error: " + error.getMessage());
      }
      try
      {
         num = "980";
         price = 1001.00;
         Product fourth = new Product(num, price); 
         System.out.println("Product #" + num + " is ok");
      }
      catch(ProductException error)
      {
         System.out.println("Product Error: " + error.getMessage());
      }
   }
}