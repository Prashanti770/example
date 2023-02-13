package example;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		//int originalNum = num;
		int sum = 0;
		System.out.println("Entered number is : "+ num);
		while(num>0) {
			sum = sum+ num%10;
			num = num/10;			
			
		}
		System.out.println("Sum of digits is : "+ sum);

	}

}
