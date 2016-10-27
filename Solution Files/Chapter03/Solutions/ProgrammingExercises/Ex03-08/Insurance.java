import java.util.Scanner;

public class Insurance {
	private static Scanner input;

	public static void main(String args[]) {
		int currYear;
		int birthYear;
		int premium;
		input = new Scanner(System.in);
		System.out.println("Enter the current year >> ");
		currYear = input.nextInt();
		System.out.print("Enter the birth year >>");
		birthYear = input.nextInt();
		premium = calculatePremium(currYear, birthYear);
		System.out.println("The premium is $" + premium);
	}

	public static int calculatePremium(int curr, int birth) {
		final int ADDITION_FACTOR = 15;
		final int MULTIPLICATION_FACTOR = 20;
		int age = curr - birth;
		int decade = age / 10;
		int premium = (ADDITION_FACTOR + decade) * MULTIPLICATION_FACTOR;
		return premium;
	}
}
 
