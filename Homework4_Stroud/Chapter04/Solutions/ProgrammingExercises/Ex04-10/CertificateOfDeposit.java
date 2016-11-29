import java.util.*;
public class CertificateOfDeposit
{
   private String certNum;
   private String lastName;
   private double balance;
   private GregorianCalendar issueDate;
   private GregorianCalendar maturityDate;
   private static final int YEARS = 1;
   public CertificateOfDeposit(String num, String name, double bal, GregorianCalendar issue)
   {
      certNum = num;
      lastName = name;
      balance = bal;
      issueDate = new GregorianCalendar(issue.get(issue.YEAR),
      issue.get(issue.MONTH), issue.get(issue.DAY_OF_MONTH));
      int month = issueDate.get(issueDate.MONTH);
      int day = issueDate.get(issueDate.DAY_OF_MONTH);
      int year = issueDate.get(issueDate.YEAR);
      year = year + YEARS;
      maturityDate = new GregorianCalendar(year, month, day);
   }
   public void setCertNum(String n)
   {
      certNum = n;
   }
   public void setName(String name)
   {
      lastName = name;
   }
   public void setBalance(double bal)
   {
       balance = bal;
   }
   public void issueDate(GregorianCalendar date)
   {
      issueDate = date;
   }
   public String getCertNum()
   {
      return certNum;
   }
   public String getName()
   {
     return lastName;
   }
   public double getBalance()
   {
      return balance;
   }
   public GregorianCalendar getIssueDate()
   {
      return issueDate;
   }
   public GregorianCalendar getMaturityDate()
   {
      return maturityDate;
   }
}
