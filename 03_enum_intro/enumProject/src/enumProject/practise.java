/**
 * 
 */
package enumProject;

import java.util.Scanner;

/**
 * @author bidus
 *
 */
public class practise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputreader;
		inputreader = new Scanner(System.in);

		int number;
		number = 0;
		System.out.print("enter your number ");
		number = inputreader.nextInt();

		if (number > 1000) {
			System.out.print(" you are right!");
		}
		if (number == 1000) {
			System.out.print(" correct!");
		}

		if (number < 1000) {
			System.out.print(" you have entered wrong invalid number ");
		}

		int year;
		year = 0;
		System.out.print("enter your leapyear ");
		year = inputreader.nextInt();
		int A = 0;

		if (year % 4 == 0) {
			if (year % 100 != 0) {
				A = 1;

			}
		}
		if (year % 400 == 0) {
			A = 1;

		}

		if (A == 1) {
			System.out.print(year + " is a leapyear");
		} else {
			System.out.print(year + " is not a leapyear");
		}

	}

}
