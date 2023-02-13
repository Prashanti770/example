package example;

import java.util.Scanner;

public class AlphabetsCount {

	public static void main(String[] args) {
		
		String str = "Time is money";
		str = str.toLowerCase();
		System.out.println("Given string is : " +str);
		int len = str.length();
		System.out.println("Length of String is :" + len);
		int count = 0;
		for(int i=0; i<len;i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
				
		}	
		System.out.println("Count of Alphabets is: "+ count);

	}

}
