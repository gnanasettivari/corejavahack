package hackathon;

import java.util.Scanner;

public class PalindromeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String");
		String a = scanner.next();
		String rev = "";
		int length = a.length();
		for(int i =length-1;i>=0;i--)
		{
			rev= rev+a.charAt(i);
		}
		if (a.equals(rev.toLowerCase()))
		{
			System.out.println("String is palindrome: " +a);
		}
		else {
			System.out.println("String is not palindrome");
		}
		scanner.close();
	}

}
