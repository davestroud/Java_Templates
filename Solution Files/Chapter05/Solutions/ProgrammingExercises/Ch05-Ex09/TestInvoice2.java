public class TestInvoice2
{
  public static void main (String args[])
  {
     Invoice2 in1 = new Invoice2
        (1234,200.99,6,24,2006); // A valid invoice
     Invoice2 in2 = new Invoice2
        (123,200.45,6,24,2006); // Invalid invoice number
     Invoice2 in3 = new Invoice2
        (2518,213.99,13,24,2006); // Bad month
     Invoice2 in4 = new Invoice2
        (5677,2310.99,2,29,2007); // Bad day
     Invoice2 in5 = new Invoice2
        (7689,456.77,2,21,2013); // Bad year
     Invoice2 in6 = new Invoice2
        (1287,523.99,2,30,2012); // Bad leap year
     Invoice2 in7 = new Invoice2
        (6554,1223.55,2,29,2012);
            // Bad leap year - but SHOULD be good

     in1.show();
     in2.show();
     in3.show();
     in4.show();
     in5.show();
     in6.show();
     in7.show();
  }
}


