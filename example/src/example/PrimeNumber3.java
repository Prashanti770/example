package example;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : "+ num);
		int count =0;
		
		if(num>1) {
			
			int i= 1;
			 while(i<=num) {
				 
				 if(num%i==0) {
						count++;
					}
			 i++;
			 }
			 if(count==2)
					System.out.println("Given "+num+" number is Prime");
				else
					System.out.println("Given "+num+" number is NOT Prime");
		}
	}

}
