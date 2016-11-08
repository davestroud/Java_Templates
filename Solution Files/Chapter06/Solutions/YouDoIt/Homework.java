import java.util.Scanner;
public class Homework {

	private static Scanner input;

	public static void main(String[] args) {

		int productType;
		final int PRODUCT1 = 1;
		final int PRODUCT2 = 2;
		final int PRODUCT3 = 3;
		final int PRODUCT4 = 4;
		final int PRODUCT5 = 5;
		input = new Scanner(System.in);
		productType = input.nextInt();
		System.out.print("Enter Product No.(1-5 or -1 to Quit:");

		switch (productType) {

		case (PRODUCT1):
			break;
		case (PRODUCT2):
			break;
		case (PRODUCT3):
			break;
		case (PRODUCT4):
			break;
		case (PRODUCT5):
			break;
		}
		System.out.println("You entered " + productType);


	}
}
