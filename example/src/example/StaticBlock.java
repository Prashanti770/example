package example;

class Country {
	static String country = "India";	
	static void countryname() {

		System.out.println("Country name is " + country);
	}
	static {
		System.out.println("Capital is New Delhi");		
	}	
}
public class StaticBlock {

	public static void main(String[] args) {
		Country.countryname();
	}
	
	static {

		System.out.println("beautiful place details: " );
	}

}
