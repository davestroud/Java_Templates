import javax.swing.JOptionPane;  // program uses JOptionPane class
public class P2_Stroud_JOptionPane {

public static void main(String[] args) {

        int num1, num2, num3;
        int sum, average, product, smallest, largest;

        num1 = JOptionPane.showMessageDialog("Enter first integer: ");
        num2 = JOptionPane.showMessageDialog("Enter second integer: ");
        num3 = JOptionPane.showMessageDialog("Enter third integer: ");

        JOptionPane.showMessageDialog(null, sum);
}

public static int sum(int num1, int num2, int num3) {
        sum = num1 + num2 + num3;
}

public static int average(int num1, int num2, int num3) {
        average = (num1 + num2 + num3) / 3;
}

public static int product() {
        product = num1 * num2 * num3;
}

public static int smallest() {

}

public static int largest() {

}
}
