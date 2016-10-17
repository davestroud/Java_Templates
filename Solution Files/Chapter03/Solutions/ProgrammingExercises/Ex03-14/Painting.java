// Painting.java
// Chapter 3,Exercise 14
// Creates a class for a Painting
class Painting
{
   private String title;
   private String artist;
   private String medium;
   private double price;
   private double gallaryCommission;
   public final static double RATE = 0.20;

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String artTitle)
   {
      title = artTitle;
   }
   public String getArtist()
   {
      return artist;
   }
   public void setArtist(String painter)
   {
      artist = painter;
   }
   public String getMedium()
   {
      return medium;
   }
   public void setMedium(String med)
   {
      medium = med;
   }

   public double getPrice()
   {
      return price;
   }

   public void setPrice(double num)
   {
      price = num;
      gallaryCommission = price * RATE;
   }

   public double getCommission()
   {
      return gallaryCommission;
   }
}

