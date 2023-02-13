package example;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		
		System.out.println("length of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter values to array : ");
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum =sum+ arr[i];
		}
		
		System.out.println("Sum of the array values is : " + sum);

	}

}
