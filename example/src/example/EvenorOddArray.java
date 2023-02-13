package example;

import java.util.Scanner;

public class EvenorOddArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of the array");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("enter the values :");
		for (int i=0; i<num;i++) {
			arr[i] = sc.nextInt();
		}
		//System.out.println("entered values are: "+arr[0]);
		System.out.println("Entered even values are:");
		for(int i=0; i<arr.length;i++) {
			
			if (arr[i]%2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Entered odd values are:");
		for(int i=0; i<arr.length;i++) {
			
			if( (arr[i]%2 )!= 0) {
				System.out.println(arr[i]);
			}
	}

}
}
