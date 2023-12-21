import java.util.Scanner;

/**
 * 
 */

/**
 * @author bidus
 *
 */
public class NestedIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputreader;
		inputreader = new Scanner(System.in);

		boolean havekids;
		havekids = true;
		System.out.print("Do you have kids ");
		havekids = inputreader.nextBoolean();

		if (havekids == true) {
			System.out.print("how  many kids you have ");
			int kids;
			kids = inputreader.nextInt();

			if (kids > -1) {
				System.out.print("you have " + kids + " kids");
				

			} else {
				System.out.print("kids can not be negative number");
			}

		} else {
			System.out.print("you are giving wrong info\n");
			
		}

		int dateOfYear;
		dateOfYear = 0;
		System.out.print("your date of birth is ");
		dateOfYear = inputreader.nextInt();

		if (dateOfYear > 1999) {
			System.out.print("you are old!");
		} else {
			System.out.print(" you are young!\n");
		}

		int number1;
		number1 = 0;
		System.out.print("enter your number ");
		number1 = inputreader.nextInt();

		if (number1 < 100) {
			System.out.print(" you are right!");
		} else {
			System.out.print(number1 + " is grater than 100.");
			System.out.print(" you have entered wrong invalid number");
		}

	}

}
