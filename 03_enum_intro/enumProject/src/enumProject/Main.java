/**
 * 
 */
package enumProject;

import java.util.Scanner;

/**
 * @author bidus
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputoutput = new Scanner(System.in);

		// input 2 number and 1 character

		int number = 0, number1 = 0;
		number = inputoutput.nextInt();
		number1 = inputoutput.nextInt();

		char A = '\0';
		A = inputoutput.next().charAt(0);

		// System.out.print(number + " " + number1 + " " + A);

		// System.out.printf("%d %d %c", number, number1, A);

		// convert character into enum
		char B = A;
		int x = 5;

		Oparator op = Oparator.UNKNOWN;

		if (B == '+') {
			op = Oparator.PLUS;
		}
		if (B == '-') {
			op = Oparator.MINUS;

		}
		// System.out.print(op);

		// switch over enum to find answer
		int r = 0;
		String v = null;
		boolean w = true;

		switch (op) {

		case PLUS: {
			w = true;

			r = number + number1;

			break;
		}

		case MINUS: {
			w = true;

			r = number - number1;
			break;
		}

		case UNKNOWN: {
			w = false;

			v = ("i don't get it");

			break;
		}

		default: {
			break;
		}

		}

		// print the answer
		if (w == true) {
			System.out.print(r);
		} else {
			System.out.print(v);
		}

		

	}

}
