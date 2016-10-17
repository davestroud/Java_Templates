public class Order
{
   private int orderNum;
   private String custName;
   private String custAddress;
   private int[] list = new int[4];
   private double total;
   private double shipAndHandle;
   public Order(int num, String name, String add, int[] items, double tot, double sh)
   {
      orderNum = num;
      custName = name;
      custAddress = add;
      for(int x = 0; x < list.length; ++x)
         list[x] = items[x];
      total = tot;
      shipAndHandle = sh;
   }
   public Order()
   {
      orderNum = 0;
   }
   public int getOrderNum()
   {
      return orderNum;
   }
   public String getName()
   {
      return custName;
   }
   public String getAddress()
   {
     return custAddress;
   }
   public double getTotal()
   {
    return total;
   }
   public double getShipAndHandle()
   {
      return shipAndHandle;
   }
}