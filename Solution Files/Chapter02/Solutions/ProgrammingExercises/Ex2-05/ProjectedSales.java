// ProjectedSales.java

class ProjectedSales
{
   public static void main(String[] args)
   {
      final double INCREASE = 0.10;
      int northSales = 4000;
      int southSales = 5500;
      double northProjection;
      double southProjection;
      northProjection = northSales + northSales * INCREASE;
      southProjection = southSales + southSales * INCREASE;
      System.out.println("The projected sales figure for the North division is " +
         northProjection);
      System.out.println("The projected sales figure for the South division is " +
         southProjection);
   }
}