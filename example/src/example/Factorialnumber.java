package example;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : "+ num);
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact =fact * i;
			
		}
		System.out.println("Factorial of number is : "+ fact);


	}

}
