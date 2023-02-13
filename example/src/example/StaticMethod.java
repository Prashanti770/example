package example;

class AadharDetails1{	
	static String country = "India";	
	static void personinfo(String name, char gender, int aadharno) {		
		System.out.println("name of a person "+name );
		System.out.println("gender of a person "+gender );
		System.out.println("aadhar number of a person "+aadharno );
		System.out.println("Country of a person "+country ); //Cannot make a static reference to the non-static field country
	}
	static void countryname() {
		System.out.println("Country name is "+country );
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		//ways of calling static methods
		System.out.println("1. Creating object for the class and calling");
		AadharDetails1 pc = new AadharDetails1();
		pc.personinfo("Aparna", 'F', 12345);
		System.out.println("*******");	
		pc.personinfo("Shanthi", 'F', 67890);		
		System.out.println("2. directly calling method by using class name without object creation");
		//Pancard1.personinfo("Shanthi", 'F', 67890);//Cannot make a static reference to the non-static method
		AadharDetails1.personinfo("Jeevitha", 'F', 69890);
        System.out.println("3. By directly calling the method name");
       // personinfo("ITCrats", 'M', 67890);
       // countryname();
        
        
	}

}
