public class TestInvoice
{
  public static void main (String args[])
  {
     Invoice in1 = new Invoice
        (1234,200.99,6,24,2006); // A valid invoice
     Invoice in2 = new Invoice
        (123,200.45,6,24,2006); // Invalid invoice number
     Invoice in3 = new Invoice
        (2518,213.99,13,24,2006); // Bad month
     Invoice in4 = new Invoice
        (5677,2310.99,7,34,2008); // Bad day
     Invoice in5 = new Invoice
        (7689,456.77,2,21,2013); // Bad year
     Invoice in6 = new Invoice
        (12,545.99,-2,67,2022); // Bad everything
     in1.show();
     in2.show();
     in3.show();
     in4.show();
     in5.show();
     in6.show();
  }
}


