public class Product
{
   String productNum;
   double price;
   final double MIN = 0.01;
   final double MAX = 1000.00;
   public Product(String num, double pr) throws ProductException
   {
      productNum = num;
      price = pr;
      if((productNum.length() != 3) || (price < MIN) || (price > MAX))
	 throw (new ProductException(productNum + " " + price));
   }
}
