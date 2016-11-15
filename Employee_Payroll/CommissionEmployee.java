// CommissionEmployee.java
// CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee {

  private double grossSales;      //gross weekly sales
  private double commissionRate;  // commission percentage

  // five-argument constructor
  public CommissionEmployee( String first, String last, String ssn,
    double sales, double rate )
    {
      super( first, last, ssn );
      setGrossSales( sales );
      setCommissionRate( rate );
    } // end five-argument commissionEmployee constructor

    // set commission rate
    public void setCommissionRate( double rate )
    { // Abbreviated if..else statement: Conditional operator
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate()
    {
      return commissionRate;
    } // end method get commissionRate

    // set gross sales amount
    public void setGrossSales( double sales )
    {
      grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    } // end method setGrossSales

    // return gross sales amount
    public double getGrossSales()
    {
      return grossSales;
    } // end method getGrossSales

    // calculate earnings, override abstract method earnings in Employee
    public double earnings()
    {
      return getCommissionRate() * getGrossSales();
    } // end method earnings

    // return String representation of CommissionEmployee object
    public String toString()
    {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
        "commission employee", super.toString(),
        "commission rate", getCommissionRate() );
    } // end method toString
} // end class CommissionEmployee
