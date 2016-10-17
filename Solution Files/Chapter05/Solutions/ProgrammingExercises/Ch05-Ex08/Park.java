public class Park
{
   private String name;
   private int acres;
   boolean hasPicnic;
   boolean hasTennis;
   boolean hasPlayground;
   boolean hasPool;
   private static final int MAX_ACRES = 400;
   public void setName(String name)
   {
      this.name = name;
   }
   public void setAcres(int acres)
   {
      if(acres < 0)
         acres = 0;
      else
         if(acres > MAX_ACRES)
            acres = MAX_ACRES;
      this.acres = acres;
   }
   public void setHasPicnic(boolean picnic)
   {
      hasPicnic = picnic;
   }
   public void setHasTennis(boolean tennis)
   {
      hasTennis = tennis;
   }
   public void setHasPlayground(boolean playground)
   {
      hasPlayground = playground;
   }
   public void setHasPool(boolean pool)
   {
      hasPool = pool;
   }
   public String getName()
   {
      return name;
   }
   public int getAcres()
   {
      return acres;
   }
   public boolean getHasPicnic()
   {
      return hasPicnic;
   }
   public boolean getHasTennis()
   {
      return hasTennis;
   }
   public boolean getHasPlayground()
   {
      return hasPlayground;
   }
   public boolean getHasPool()
   {
      return hasPool;
   }
}