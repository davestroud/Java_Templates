import java.util.Scanner;
public class TestDigitalCameraArray
{
   public static void main(String[] args)
   {
      DigitalCamera[] cameras = new DigitalCamera[4];
      int x;
      for(x = 0; x < cameras.length; ++x)
         cameras[x] = getData();
      for(x = 0; x < cameras.length; ++x)
         cameras[x].display();
   }
   public static DigitalCamera getData()
   {
      String brand;
      int megapixels;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter camera brand ");
      brand = in.nextLine();
      System.out.print("Enter megapixels ");
      megapixels = in.nextInt();
      in.nextLine();
      DigitalCamera c = new DigitalCamera(brand, megapixels);
      return c;
   }
}