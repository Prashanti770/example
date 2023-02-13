package example;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : "+ num);
	
		int count =0;
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				
				if(num%i==0) {
					count++;
				}
			}
				if(count==2)
					System.out.println("Given number is Prime");
				else
					System.out.println("Given number is NOT Prime");
			
		}

	}

}

