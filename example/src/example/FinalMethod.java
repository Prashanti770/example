package example;
class RBI{
	
	final void rateofinterest(int interest) {
		 
		System.out.println("rate of interest of RBI is " + interest);
//	}
//}
//class SBI extends RBI{
	
	//void rateofinterest(int interest) { // Cannot override the final method from RBI
		interest = interest + 10;
		System.out.println("rate of interest of SBI is " + interest);
	}	
}
public class FinalMethod {

	public static void main(String[] args) {
	//	SBI sbi = new SBI();
	//	sbi.rateofinterest(20);	
//
	}
}
