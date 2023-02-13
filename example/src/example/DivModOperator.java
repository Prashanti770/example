package example;

import java.util.Scanner;

public class DivModOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number2 : ");
		int num2 = sc.nextInt();
		System.out.println("Entered numbers are : "+ num1 +" and "+ num2);
		int div = num1/num2; //Division operator
		System.out.println("Divsion of numbers "+num1+" and " +num2+"  is :"+ div);
		int mod = num1%num2; //Modulus operator
		System.out.println("Divsion of numbers "+num1+" and " +num2+"  is :"+ mod);

	}

}
