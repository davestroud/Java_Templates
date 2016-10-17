class Gadget
{
   private int itemNum;
   private String description;
   private double price;
   public Gadget(int num, String desc, double pr)
   {
      itemNum = num;
      description = desc;
      price = pr;
   }
   public Gadget()
   {
      itemNum = 999;
   }
   public int getItemNum()
   {
      return itemNum;
   }
   public String getDescription()
   {
      return description;
   }
   public double getPrice()
   {
      return price;
   }
}