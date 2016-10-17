public class TestState
{
   public static void main(String[] args)
   {
      State s1 = new State("Illinois", 13000000, "Springfield", 116000, "Chicago", 7000000);
      State s2 = new State("Wisconsin", 570000, "Madison", 230000, "Milwaukee", 595000);
      display(s1);
      display(s2);
   }
   public static void display(State s)
   {
      System.out.println("\nState: " + s.getName() + " population: " + s.getPopulation());
      System.out.println("   Capital: " + s.getCapitalName() +
        " population: " + s.getCapitalPopulation());
      System.out.println("   Most populous city: " + s.getMostPopulousCityName() +
        " population: " + s.getPopulousPopulation());
   }
}
