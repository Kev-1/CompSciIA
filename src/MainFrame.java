//first java project
import java.util.Scanner;
public class MainFrame {
	
	public static void main(String[] args) {
		int myNumber;
		myNumber = 5;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the first number:");
		int one = input.nextInt();
		System.out.println("Please input the second number:");
		int two = input.nextInt();
		int total = one + two;
		System.out.println(one + "+" + two + "=" + total);
		
	}
}