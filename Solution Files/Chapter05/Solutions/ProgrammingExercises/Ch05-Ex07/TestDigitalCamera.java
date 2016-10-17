import java.util.Scanner;
public class TestDigitalCamera
{
   public static void main(String[] args)
   {
      DigitalCamera camera1;
      DigitalCamera camera2;
      DigitalCamera camera3;
      DigitalCamera camera4;
      camera1 = getData();
      camera2 = getData();
      camera3 = getData();
      camera4 = getData();
      camera1.display();
      camera2.display();
      camera3.display();
      camera4.display();
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