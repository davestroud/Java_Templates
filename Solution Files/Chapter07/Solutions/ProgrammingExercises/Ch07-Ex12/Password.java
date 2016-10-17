import javax.swing.*;
public class Password
{
   public static void main(String[] args)
   {
      String password = "", password2;
      int stringLength, x;
      boolean isGood = false;
      boolean atLeastOneDigit;
      boolean atLeastOneLetter;
      final int MIN = 6;
      final int MAX = 10;
      while(!isGood)
      {
         isGood = true;
         atLeastOneDigit = false;
         atLeastOneLetter = false;
         password = JOptionPane.showInputDialog(null,
           "Enter your password\n" +
           "It must be " + MIN + " to " + MAX + " characters and\n" +
           "have at least one digit and one letter");
         stringLength = password.length();
         if(stringLength < MIN || stringLength > MAX)
            isGood = false;
         for(x = 0; x < stringLength; ++x)
            if(Character.isDigit(password.charAt(x)))
               atLeastOneDigit = true;
         for(x = 0; x < stringLength; ++x)
            if(Character.isLetter(password.charAt(x)))
               atLeastOneLetter = true;
         if(!(atLeastOneDigit && atLeastOneLetter))
             isGood = false;
         for(x = 0; x < stringLength; ++x)
            if(!(Character.isDigit(password.charAt(x)) ||
               Character.isLetter(password.charAt(x))))
                   isGood = false;
      }
      password2 = JOptionPane.showInputDialog(null,
        "Verify your password");
      while(!password.equals(password2))
         password2 = JOptionPane.showInputDialog(null,
           "That password does not match\nVerify your password");
      JOptionPane.showMessageDialog(null, "Success!");
  }
}