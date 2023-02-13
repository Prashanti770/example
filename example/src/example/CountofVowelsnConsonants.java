package example;

public class CountofVowelsnConsonants {

	public static void main(String[] args) {
		String str = "Time is money";
		str = str.toLowerCase();
		System.out.println("Given string is : " +str);
		int vCount = 0;
		int cCount =0;
		
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
					str.charAt(i)=='o' || str.charAt(i)=='u') {
				vCount++;
				
			}
			else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				cCount++;
			}
		}
   System.out.println("Vowels count from given string is "+ vCount);
   System.out.println("Consonants count from given string is "+ cCount);
	}

}
