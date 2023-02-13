package example;

import java.util.Scanner;

public class CountNumberofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		//int originalNum = num;
		System.out.println("Entered number is : "+ num);
		int count =0;
		
		while(num>0) {
			num = num/10;
			count++;
			
		}
		System.out.println("Count of given number is: "+count);

	}

}
