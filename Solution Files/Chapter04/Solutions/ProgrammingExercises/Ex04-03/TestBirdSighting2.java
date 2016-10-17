public class TestBirdSighting2
{

  public static void main(String[] args)
  {
    BirdSighting2 sighting = new BirdSighting2();

    System.out.println(sighting.getNumber() + " " + sighting.getSpecies() +
      "(s) sighted on day " + sighting.getDay() + " of the year.");
 
    BirdSighting2 sighting2 = new BirdSighting2("cardinal", 3, 75);

    System.out.println(sighting2.getNumber() + " " + sighting2.getSpecies() +
      "(s) sighted on day " + sighting2.getDay() + " of the year.");;
  }
}