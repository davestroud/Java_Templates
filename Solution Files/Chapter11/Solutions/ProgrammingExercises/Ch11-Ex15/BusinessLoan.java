// BusinessLoan.java
// Chapter 10, Exercise 15
public class BusinessLoan extends Loan
{
   public BusinessLoan(int num, String name, double amt, int yrs,  double prime)
   {
      super(num, name, amt, yrs);
      rate = prime + .01;
   }
}