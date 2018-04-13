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
			if (tompel.equals("multiply") || tompel.equals("x") || tompel.equals("*")) {
				int total = one * two;
				System.out.println(one + " Mutliplied by " + two + " Equals to " + total);
				end();
			} else if (tompel.equals("add") || tompel.equals("x")) {
				int total = one + two;
				System.out.println(one + " Added by " + two + " Equals to " + total);
				end();
			} else if (tompel.equals("minus") || tompel.equals("-") || tompel.equals("subtract")) {
				int total = one - two;
				System.out.println(one + " Minus " + two + " Equals to " + total);
				end();
			} else if (tompel.equals("divide") || tompel.equals("/")) {
				int total = one / two;
				System.out.println(one + " Divided by " + two + " Equals to " + total);
				end();
			} else {
				System.out.println("You have entered an invalid input.\nPlease try again.\n");
				main(args);
			}
			} catch (java.util.InputMismatchException name) {
		        System.out.println("You have entered a letter, or the number inputted exceeds 1 trillion.\nPlease try again.\n");
		        main(args);
			}
		}
	
	public static void end() {
		System.out.println("Thank you for using this program!\nCreated by Kevin");
	}
	
	public static void addition() {
	}
}