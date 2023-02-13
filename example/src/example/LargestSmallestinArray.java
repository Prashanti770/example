package example;

import java.util.Scanner;

public class LargestSmallestinArray {

	public static void main(String[] args) {

		System.out.println("length of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter values to array : ");
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		//System.out.println(arr[9]);
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];		
			}
				else if(arr[i] >largest) {
				largest = arr[i];
			}
		}
		System.out.println("Smallest value in array is: "+smallest);
		System.out.println("Largest value in array is: "+largest);
		
	}

}
