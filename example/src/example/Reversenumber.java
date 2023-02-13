package example;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int originalNum = num;
		System.out.println("Entered number is : "+ num);
		int rev = 0;
        
		while(num > 25) {
		
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		System.out.println("Reverese of "+originalNum+" is : "+ rev);
	}
	

}
