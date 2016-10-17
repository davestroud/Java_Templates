public class EverySum
{
  public static void main (String args[])
  {
     int sum = 0;
     final int MAX = 50;
     for(int i = 1; i <= MAX; i++)
     {
	sum += i;
        System.out.print("  " + sum);
     }
  }
}


