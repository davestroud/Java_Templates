import java.util.*;
public class State
{
   private String name;
   private int population;
   private City capital;
   private City mostPopulousCity;
   public State(String name, int pop, String capName, int capPop, String biggestName, int biggestPop)
   {
      this.name = name;
      population = pop;
      capital = new City(capName, capPop);
      mostPopulousCity = new City(biggestName, biggestPop);
   }
   public String getName()
   {
      return name;
   }
   public int getPopulation()
   {
      return population;
   }
   public String getCapitalName()
   {
      return capital.getName();
   }
   public int getCapitalPopulation()
   {
      return capital.getPopulation();
   }
   public String getMostPopulousCityName()
   {
      return mostPopulousCity.getName();
   }
   public int getPopulousPopulation()
   {
      return mostPopulousCity.getPopulation();
   }
   private class City
   {
      private String name;
      private int population;
      public City(String name, int pop) 
      {
         this.name = name;
         population = pop;
      }
      public String getName()
      {
         return name;
      } 
      public int getPopulation()
      {
         return population;
      }
   }
}