public class TestPainting
{
   public static void main(String[] args)
   {
      Painting p1 = new Painting();
      Painting p2 = new Painting();
      Painting p3 = new Painting();
      p1.setTitle("Starry Night");
      p1.setArtist("Van Gogh");
      p1.setMedium("oil");
      p1.setPrice(2000000);

      p2.setTitle("My Dog");
      p2.setArtist("Billy Thompson");
      p2.setMedium("crayon");
      p2.setPrice(5);
      System.out.println("The " + p1.getMedium() +
         " painting named " + p1.getTitle() + " by " +
         p1.getArtist() + " sells for $" + p1.getPrice() +
         "\n    and the gallery makes $" +
         p1.getCommission() + " commission");
      System.out.println("The " + p2.getMedium() +
         " painting named " + p2.getTitle() + " by " +
         p2.getArtist() + " sells for $" + p2.getPrice() +
         "\n    and the gallery makes $" +
         p2.getCommission() + " commission");
      System.out.println("The " + p3.getMedium() +
         " painting named " + p3.getTitle() + " by " +
         p3.getArtist() + " sells for $" + p3.getPrice() +
         "\n    and the gallery makes $" +
         p3.getCommission() + " commission");
      System.out.println("The gallery commission rate is " + (Painting.RATE * 100) + " percent");
   }
}