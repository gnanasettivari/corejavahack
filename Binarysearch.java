package hackathon;

import java.util.Scanner;

public class Binarysearch {
	
public static void binary(int low,int high,int key,int[]a) {
		
		int mid;
		while(low <= high) {
			mid = (low + high)/2;
			if(a[mid]==key) {
				
				System.out.println("Element present in the list");
				break;
			}
			
			else if(a[mid]> key)
				high = mid -1;
			else if(a[mid]< key)
				low = mid+1;
		}
		if (low > high)
			System.out.println("Element not present in the list");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0, key = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		
		n= scanner.nextInt();
		int[]a=new int[n];
		System.out.println("Enter Array Elements in ascending order");
		for(int i =0 ; i<a.length ; i++)
		{
			a[i] =scanner.nextInt();
			
		}
		System.out.println("Enter the Key");
		key = scanner.nextInt();
		binary(0, n-1, key, a);

			}

}
