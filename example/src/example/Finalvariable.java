package example;

class RateOfInterest{
	
	 final int rate = 10;
	
	void sbi() {
	//	rate = 25; // shows error : The final field RateOfInterest.rate cannot be assigned
		System.out.println("rate of interst of sbi : "+ rate);
	}
}

public class Finalvariable {

	public static void main(String[] args) {
		RateOfInterest roi = new RateOfInterest();
		roi.sbi();
			
	}

}

