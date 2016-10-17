// CommentsDialog.java
// Chapter 1, Exercise #11
// Displays comments in dialog box
import javax.swing.JOptionPane;
class CommentsDialog
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog
         (null, "Programming comments are non-executing statements" +
         "\nyou add to a program for the purpose of documentation");
       System.exit(0); 
       // line comments
       // Programming comments are nonexecuting statements you add
       // to a program for the purpose of documentation
       // block comments
       /* Programming comments are non-executing statements you add
          to a program for the purpose of documentation */
       // javadoc comments
       /** Programming comments are non-executing statements you add
        to a program for the purpose of documentation  */
    }
}