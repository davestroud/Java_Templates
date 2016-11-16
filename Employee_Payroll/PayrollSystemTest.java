// PayrollSystemTest.java
// Employee hierarchy test program

public class PayrollSystemTest {

  public static void main(String[] args) {

    // Create subclass objects
    SalariedEmployee salariedEmployee =
      new SalariedEmployee hourlyEmployee("John", "Smith", "111-11-111", 800.00 );
    HourlyEmployee hourlyEmployee =
      new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40 );
    CommissionEmployee commissionEmployee =
      new CommissionEmployee("Sue", "Jones", "333-33-333", 10000, .06);
    BasePlusCommissionEmployee basePlusCommissionEmployee =
      new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300 );

    System.out.println("Employees processed individually:\n" );

    System.out.printf( "%s\n%s: $%,.2f\n\n",
       salariedEmployee, "earned", salariedEmployee.earnings() );
    System.out.printf( "%s\n%s: $%,.2f\n\n",
       hourlyEmployee, "earned", hourlyEmployee.earnings() );
    System.out.printf( "%s\n%s: $%,.2f\n\n",
       commissionEmployee, "earned", commissionEmployee.earnings() );
    System.out.printf( "%s\n%s: $%,.2f\n\n",
    basePlusCommissionEmployee,
    "earned", basePlusCommissionEmployee.earnings() );

    // create four-element Employee array
    Employee employees[] new Employee[ 4 ];

    // initialize array with Employees
    employees [ 0 ] = salariedEmployee;
    employees [ 1 ] = hourlyEmployee;
    employees [ 2 ] = commissionEmployee;
    employees [ 3 ] = basePlusCommissionEmployee;

    System.out.println( "Employees processed polymorphically:\n" ); 




  }
}
