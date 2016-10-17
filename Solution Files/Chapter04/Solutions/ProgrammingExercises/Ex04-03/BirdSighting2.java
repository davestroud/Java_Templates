public class BirdSighting2
{
   String species;
   int number;
   int day;

   public BirdSighting2()
   {
      this("robin", 1, 1);
   }

   public BirdSighting2(String species, int number, int day)
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