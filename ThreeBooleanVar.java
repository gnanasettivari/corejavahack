package hackathon;

import java.util.Scanner;

public class ThreeBooleanVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the values of a,b and c");
		boolean a,b,c;
		System.out.println("Enter the value of a");
		a = scanner.nextBoolean();
		System.out.println("enter the value of b");
		b= scanner.nextBoolean();
		System.out.println("Enter the value of c");
		c= scanner.nextBoolean();
		if(a && b|| b && c||c&& a) {
			System.out.println("Print atleast two of them are true");
		}
		else {
			System.out.println("print atleast two of them are not true");
		}
	} 

}
