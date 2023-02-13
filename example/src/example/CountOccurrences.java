package example;

import java.util.Scanner;

public class CountOccurrences {

	public static void main(String[] args) {
		String str = "Seller sells sea shells at sea shore";
		str = str.toLowerCase();
		System.out.println("Given string is : " +str);
		char c = 'i';
		int count = 0;
		
		for (int i=0;i<str.length();i++) {
			
			if((str.charAt(i)==c)) {
				count++;
				
			}
						
		}
		System.out.println("Count of given character is :"+count);
	}

}
