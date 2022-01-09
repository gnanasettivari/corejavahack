package hackathon;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read= new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String str= read.nextLine();
		String reverseString = "";
		
		for(int i = str.length()-1;i>=0; i--) {
			
			reverseString= reverseString+str.charAt(i);
		}
		System.out.println("Reverse String");
		
		System.out.println(reverseString);
	}

}
