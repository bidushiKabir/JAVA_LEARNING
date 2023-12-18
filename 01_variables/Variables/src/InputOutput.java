import java.util.Scanner;

/**
 * Bidushi Dec. 16, 2023
 * 
 */

/**
 * @author bidus
 *
 */
public class InputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare variables
		// Initialize Variables
		// Read input and assign to variables
		// Print variables values
		Scanner inputreader;
		inputreader = new Scanner(System.in);

		char kids;
		kids = '0';
		System.out.print("How many kids you have ");
		kids = inputreader.next().charAt(0);
		System.out.print("you have  ");
		System.out.print(kids);
		System.out.println(" kids");
		System.out.println("you have "+ kids +"kids");

		boolean havekids;
		havekids = true;
		System.out.print("Do you have kids ");
		havekids = inputreader.nextBoolean();
		System.out.print("I have kids.it's ");
		System.out.println(havekids);

		float totalcost;
		totalcost = 0;
		System.out.print("what is your monthly total cost ");
		totalcost = inputreader.nextFloat();
		System.out.print("your monthly total cost is ");
		System.out.println(totalcost);

		double price;
		price = 0;
		System.out.print("what is your car price $ ");
		price = inputreader.nextDouble();
		System.out.print("your car is $ ");
		System.out.println(price);

		byte age;
		age = 0;
		System.out.print("enter your age ");
		age = inputreader.nextByte();
		System.out.print("your age is ");
		System.out.println(age);

		short birthday;
		birthday = 0;
		System.out.print("enter your birthday ");
		birthday = inputreader.nextShort();
		System.out.print("your birthday date ");
		System.out.println(birthday);

		long monthlyincome;
		monthlyincome = 0;
		System.out.print("Enter your monthly income ");
		monthlyincome = inputreader.nextLong();
		System.out.print(" your monthly income ");
		System.out.println(monthlyincome);

		int rollnum;
		rollnum = 0;
		System.out.print("Enter your rollnum ");
		rollnum = inputreader.nextInt();
		System.out.print("your rollnum ");
		System.out.println(rollnum);

	}

}
