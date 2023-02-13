package example;
class AadharDetails{	
	static String country = "India";	
	void info(String name, char gender, int aadharno) {		
		System.out.println("name of a person "+name );
		System.out.println("gender of a person "+gender );
		System.out.println("aadhar number of a person "+aadharno );
		System.out.println("Country of a person "+country );
	}
}
class Pancard extends AadharDetails{
	void info(String name, char gender, int aadharno, String panno) {		
		System.out.println("name of a person "+name );
		System.out.println("gender of a person "+gender );
		System.out.println("aadhar number of a person "+aadharno );
		System.out.println("PAN number of a person "+panno );
		System.out.println("Country of a person "+country );		
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		Pancard pc = new Pancard();
		pc.info("Aparna", 'F', 12345, "BEJM987");
		System.out.println("*******");	
		pc.info("Shanthi", 'F', 67890, "AES12J");
		
	}

}
