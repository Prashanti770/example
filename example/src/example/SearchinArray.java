package example;

import java.util.Scanner;

public class SearchinArray {

	public static void main(String[] args) {
		System.out.println("length of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter values to array : ");
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		int flag =0;
		System.out.println("Enter value to search in array : ");
		int search = sc.nextInt();
		int position = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(search == arr[i]) {
				position = i+1;
				flag = 1;
				break;
			}
			
		}
		System.out.println("Element found at" + position);
		if(flag == 0) {
			System.out.println("Element not found");
		}
		
	}

}
