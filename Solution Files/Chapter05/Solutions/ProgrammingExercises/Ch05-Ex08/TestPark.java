import java.util.Scanner;
public class TestPark
{
   public static void main(String[] args)
   {
      Park p1 = new Park();
      Park p2 = new Park();
      Park p3 = new Park();
      p1.setName("Creekside");
      p1.setAcres(20);
      p1.setHasPicnic(true);
      p1.setHasTennis(false);
      p1.setHasPlayground(true);
      p1.setHasPool(false);
      p2.setName("Shady Oaks");
      p2.setAcres(40);
      p2.setHasPicnic(true);
      p2.setHasTennis(true);
      p2.setHasPlayground(true);
      p2.setHasPool(false);
      p3.setName("Willow");
      p3.setAcres(401);
      p3.setHasPicnic(false);
      p3.setHasTennis(false);
      p3.setHasPlayground(false);
      p3.setHasPool(true);
      System.out.println("\nHas picnic facilities and playground");
      System.out.println(p1.getName() + " " + hasPicnicAndPlayground(p1));
      System.out.println(p2.getName() + " " + hasPicnicAndPlayground(p2));
System.out.println(p3.getName() + " " + hasPicnicAndPlayground(p3));
      System.out.println("\nHas requested features");
      System.out.println(p1.getName() + " " + hasRequestedFeatures(p1, true, false, false, false));
      System.out.println(p1.getName() + " " + hasRequestedFeatures(p1, false, true, false, false));
      System.out.println(p2.getName() + " " + hasRequestedFeatures(p2, true, true, false, false));
      System.out.println(p2.getName() + " " + hasRequestedFeatures(p2, false, false, false, false));
      System.out.println(p3.getName() + " " + hasRequestedFeatures(p3, false, false, false, true));
      System.out.println(p3.getName() + " " + hasRequestedFeatures(p3, true, false, false, false));
       System.out.println("\nHas exactly requested features");
      System.out.println(p1.getName() + " " + hasExactFeatures(p1, true, false, true, false));
      System.out.println(p1.getName() + " " + hasExactFeatures(p1, false, false, true, false));
      System.out.println(p2.getName() + " " + hasExactFeatures(p2, true, true, true, false));
      System.out.println(p2.getName() + " " + hasExactFeatures(p2, true, true, false, false));
      System.out.println(p3.getName() + " " + hasExactFeatures(p3, false, false, false, true));
      System.out.println(p3.getName() + " " + hasExactFeatures(p3, false, false, false, false));
      System.out.println("\nCount features");
      System.out.println(p1.getName() + " count is " + countFeatures(p1));
      System.out.println(p2.getName() + " count is " + countFeatures(p2));
      System.out.println(p3.getName() + " count is " + countFeatures(p3));
      System.out.println("\nLarger park");
      System.out.println("Of " + p1.getName() + " and " + p2.getName() + " the larger park is " + getLargerPark(p1, p2).getName()); 
      System.out.println("Of " + p2.getName() + " and " + p3.getName() + " the larger park is " + getLargerPark(p2, p3).getName());
      System.out.println("Of " + p1.getName() + " and " + p3.getName() + " the larger park is " + getLargerPark(p1, p3).getName());
   }
   public static boolean hasPicnicAndPlayground(Park p)
   {
      boolean answer = false;
      if(p.getHasPicnic() && p.getHasPlayground())
         answer = true;
      return answer;
   }
   public static boolean hasRequestedFeatures(Park p, boolean picnic, boolean tennis, boolean play, boolean pool)
   {
      boolean answer = true;
      if(picnic)
         if(!p.getHasPicnic())
            answer = false;
      if(tennis)
         if(!p.getHasTennis())
            answer = false;
      if(play)
         if(!p.getHasPlayground())
            answer = false;
      if(pool)
         if(!p.getHasPool())
            answer = false;
      return answer;
   }
   public static boolean hasExactFeatures(Park p, boolean picnic, boolean tennis, boolean playground, boolean pool)
   {
      boolean picnicAnswer;
      boolean tennisAnswer;
      boolean playgroundAnswer;
      boolean poolAnswer;
      if(picnic)
         if(p.getHasPicnic())
            picnicAnswer = true;
         else
            picnicAnswer = false;
      else
         if(p.getHasPicnic())
            picnicAnswer = false;
         else
            picnicAnswer = true;     
      if(tennis)
         if(p.getHasTennis())
            tennisAnswer = true;
         else
            tennisAnswer = false;
      else
         if(p.getHasTennis())
            tennisAnswer = false;
         else
            tennisAnswer = true;  
      if(playground)
         if(p.getHasPlayground())
            playgroundAnswer = true;
         else
            playgroundAnswer = false;
      else
         if(p.getHasPlayground())
            playgroundAnswer = false;
         else
            playgroundAnswer = true;
      if(pool)
         if(p.getHasPool())
            poolAnswer = true;
         else
            poolAnswer = false;
      else
         if(p.getHasPool())
            poolAnswer = false;
         else
            poolAnswer = true;
      return picnicAnswer && tennisAnswer && playgroundAnswer && poolAnswer;    
   }
   public static int countFeatures(Park p)
   {
      int total = 0;
      if(p.getHasPicnic())
          total = total + 1;
      if(p.getHasTennis())
          total = total + 1;
      if(p.getHasPlayground())
          total = total + 1;
      if(p.getHasPool())
          total = total + 1;
      return total;
   }
   public static Park getLargerPark(Park p1, Park p2)
   {
      Park larger = p1;
      if(p2.getAcres() > p1.getAcres())
        larger = p2;
      return larger;
   }
}