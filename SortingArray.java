package hackathon;

import java.util.Scanner;


public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number elements in an Array");
		
		int count;
		
		count = scanner.nextInt();
		
		int num[] = new int[count];
		for (int i= 0;i< count;i++)
		{
			num[i] = scanner.nextInt();
		}
		scanner.close();
		
		
		for(int i = 0;i<count;i++) {
			for (int j = i+1;j<count;j++) {
				
				if(num[i]> num[j]) {
					
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("Array elements in acending oreder: ");
		
		for(int i = 0;i < count-1;i++) {
			System.out.println(num[i] +" ");
		}
		
    System.out.print(num[count-1]);
    
	}

}
