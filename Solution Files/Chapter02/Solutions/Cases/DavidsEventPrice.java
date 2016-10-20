import java.util.Scanner;
public class DavidsEventPrice
{
  public static void main(String[] args)
  {
    final double GUEST_PRICE = 35.00;
    final int LARGE_EVENT = 50;
    double price;
    double guests;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of guest >> ");
    guests = input.nextInt();
    System.out.println("******************************************************");
    System.out.println("*                                                    *");
    System.out.println("*   David always brings the beer to the party.       *");
    System.out.println("*                                                    *");
    System.out.println("******************************************************");
    price = guests * GUEST_PRICE;
    System.out.println("The price for an event with " + guests +
      " guests at $" + GUEST_PRICE + " per guest is $ " + price);
    System.out.println("Whether this is a large event is " +
        (guests >= LARGE_EVENT));
  }
}
