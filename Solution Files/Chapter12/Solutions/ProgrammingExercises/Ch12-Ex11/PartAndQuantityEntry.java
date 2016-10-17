import java.util.*;
public class PartAndQuantityEntry
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int partNumber;
      int quantity;
      int code = 0;
      try
      {
         System.out.print("Enter part number ");
         partNumber = kb.nextInt();
         System.out.print("Enter quantity ");
         quantity = kb.nextInt();
         check(partNumber, quantity);
         System.out.println(DataMessages.message[code]);
     }
     catch(InputMismatchException ex)
     {
        code = 1;
        System.out.println(DataMessages.message[code]);
     }
     catch(DataException ex)
     {
        System.out.println("Some data was out of range");
        System.out.println(ex.getMessage());
     }
   }
   public static void check(int part, int quantity) throws DataException
   {
      final int HIGHPART = 999;
      final int HIGHQUAN = 5000;
      int code;
      code = 2;
      if(part < 0)  
          throw (new DataException(DataMessages.message[code]));
      code = 3;
      if(part > HIGHPART)
          throw(new DataException(DataMessages.message[code]));
      code = 4;
      if(quantity < 1)
	  throw (new DataException(DataMessages.message[code]));
      code = 5;
      if(quantity > HIGHQUAN)
   throw (new DataException(DataMessages.message[code]));
  }
}
