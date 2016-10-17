import javax.swing.*;
public class SalonReport
{
   public static void main(String[] args)
   {
      Service[] service = new Service[6];
      int i;
      String message, entry;
      service[0] = new Service("Cut",8.00,15);
      service[1] = new Service("Shampoo",4.00,10);
      service[2] = new Service("Manicure",18.00,30);
      service[3] = new Service("Style",48.00,55);
      service[4] = new Service("Permanent",18.00,35);
      service[5] = new Service("Trim",6.00,5);
      entry = JOptionPane.showInputDialog(null,
        "Sort services by\n(S)ervice, (P)rice, or (T)ime");
      if(entry.charAt(0) == 'S')
      {
        servSort(service, service.length);
        message = "Sorted by Service\n";
      }
      else
         if(entry.charAt(0) == 'P')
         {
            priceSort(service, service.length);
            message = "Sorted by Price\n";
         }
         else
         {
            timeSort(service, service.length);
            message = "Sorted by time\n";
          }
      display(service, service.length, message);
   }
   public static void priceSort(Service[] array, int len)
   {
      int a, b;
      Service temp;
      int highSub = len - 1;
      for (a = 0; a < highSub; ++a)
      {
         for (b = 0; b < highSub; ++b)
         if(array[b].getPrice() > array[b + 1].getPrice())
         {
            temp = array[b];
            array[b] = array[b + 1];
            array[b + 1] = temp;
          }
        }
    }
    public static void timeSort(Service[] array, int len)
    {
        int a, b;
        Service temp;
        int highSub = len - 1;
        for (a = 0; a < highSub; ++a)
        {
           for (b = 0; b < highSub; ++b)
           if (array[b].getMinutes() > array[b + 1].getMinutes())
           {
              temp = array[b];
              array[b] = array[b + 1];
              array[b + 1] = temp;
           }
        }
     }
     public static void servSort(Service[] array, int len)
     {
        int a, b;
        Service temp;
        int highSub = len - 1;
	for (a = 0; a < highSub; ++a)
	{
	   for (b = 0; b < highSub; ++b)
	   {
              String first = array[b].getService();
              String second = array[b + 1].getService();
              if(first.compareTo(second) > 0)
	      {
	         temp = array[b];
	         array[b] = array[b + 1];
	         array[b + 1] = temp;
	      }
	   }
        }
     }
     public static void display(Service[] s, int len,  String msg)
     {
        for (int i = 0; i < len; i++)
           msg = msg + s[i].getService() + "  $" + s[i].getPrice() +
              "   " + s[i].getMinutes() + " minutes\n";
        JOptionPane.showMessageDialog(null, msg);
     }
}
