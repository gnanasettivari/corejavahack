package hackathon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number to find factorail");
		
		int a, i,fact = 1;
		a = scanner.nextInt();
		for(i = 1; i<= a;i++) {
			fact = fact*i;
		}
		
		System.out.println("factorial of no is " + fact);

	}

}
