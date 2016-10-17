import java.util.InputMismatchException;
import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {
		System.out.println("Enter your year of birth (YYYY): ");
		int year = 0;
		Scanner scanner = new Scanner(System.in);
		boolean valid = false;
		while (!valid) {
			try {
				year = scanner.nextInt();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid! Try again.");
				scanner.nextLine();
			}
		}
		System.out.println("You are " + (2016 - year) + " years old.");
	}
}