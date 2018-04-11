import java.util.Scanner;
public class MainFrame {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Please input the first number:");
			int one = input.nextInt();
			System.out.println("Please input the second number:");
			int two = input.nextInt();
			System.out.println("Please select the calculator function");
			String tompel = input.next();
			if (tompel.equals("multiplication")) {
				int total = one * two;
				System.out.println(one + " Mutliplied by " + two + " Equals to " + total);
				end();
			} else if (tompel.equals("addition")) {
				int total = one + two;
				System.out.println(one + " Added by " + two + " Equals to " + total);
				end();
			} else if (tompel.equals("minus")) {
				int total = one - two;
				System.out.println(one + " Minus " + two + " Equals to " + total);
				end();
			} else if (tompel.equals("divide")) {
				int total = one / two;
				System.out.println(one + " Divided by " + two + " Equals to " + total);
				end();
			} else {
				System.out.println("You have entered an invalid input.\nPlease try again.");
				main(args);
			}
			} catch (java.util.InputMismatchException name) {
		        System.out.println("You have entered a letter, or the number inputted exceeds 1 trillion.\nPlease try again.");
		        main(args);
			}
		}
	
	public static void end() {
		System.out.println("Thank you for using this program!");
	}
	
	public static void addition() {
	}
}