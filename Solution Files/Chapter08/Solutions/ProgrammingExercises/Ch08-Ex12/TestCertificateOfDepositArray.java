import javax.swing.*;
import  java.util.*;
public class TestCertificateOfDepositArray
{
   public static void main(String[] args)
   {
      final int MAX = 5;
      CertificateOfDeposit[] certs = new CertificateOfDeposit[MAX];
      int x;
      String certNum;
      String name;
      double balance;
      String entryString;
      int mo, da, yr;
      GregorianCalendar issueDate = new GregorianCalendar();

      for(x = 0; x < MAX; ++x)
      {
        certNum = JOptionPane.showInputDialog(null,
           "Enter certificate number");
         name = JOptionPane.showInputDialog(null,
           "Enter last name of owner");
         entryString = JOptionPane.showInputDialog(null,
           "Enter balance");
         balance = Double.parseDouble(entryString);
         entryString = JOptionPane.showInputDialog(null,
           "Enter month  of issue");
         mo = Integer.parseInt(entryString);
         entryString = JOptionPane.showInputDialog(null,
            "Enter day of issue");
         da = Integer.parseInt(entryString);
         entryString = JOptionPane.showInputDialog(null,
           "Enter year of issue");
         yr = Integer.parseInt(entryString);
         issueDate = new
            GregorianCalendar(yr, (mo-1), da);
         certs[x] = new CertificateOfDeposit(certNum, name, balance, issueDate);
      }
      for(x = 0; x < MAX; ++x)
         display(certs[x], (x + 1));
   }
   public static void display(CertificateOfDeposit cd, int num)
   {
      GregorianCalendar iDate = new GregorianCalendar();
      iDate = cd.getIssueDate();
      GregorianCalendar matDate= new GregorianCalendar(); 
      matDate = cd.getMaturityDate();
      JOptionPane.showMessageDialog(null,"Certificate " + num +
         "\nName: " + cd.getCertNum() +  " " +
         cd.getName() + "  Balance: $" + cd.getBalance() +
         "  Issued: " + 
         (iDate.get(Calendar.MONTH) + 1) +
         "/" + iDate.get(Calendar.DAY_OF_MONTH) +
         "/" + iDate.get(Calendar.YEAR) +
         "\nMaturity date is " +
         (matDate.get(Calendar.MONTH) + 1) +
         "/" + matDate.get(Calendar.DAY_OF_MONTH) +
         "/" + matDate.get(Calendar.YEAR));
   }
}