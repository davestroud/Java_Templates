public class BirdSighting
{
   String species;
   int number;
   int day;

   // constructor added for Exercise 3a
   public BirdSighting()
   {
      species = "robin";
      number = 1;
      day = 1;
   }

   // constructor added for Exercise 3b
   public BirdSighting(String species, int number, int day)
   {
      this.species = species;
      this.number = number;
      this.day = day;
   }
   public String getSpecies()
   {
      return species;
   }
   public int getNumber()
   {
      return number;
   }

   public int getDay()
   {
      return day;
   }

}