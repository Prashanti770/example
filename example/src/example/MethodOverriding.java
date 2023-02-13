package example;
//IncomeTax -> Trainee:0 -> Associate :10 % -> Senior : 20%

class TraineeIncomeTax{
	
	public int getIncomeTax() {
		return 0;
	}
}
class AssoiateIncomeTax{
	
	public int getIncomeTax() {
		return 10;
	}
}
class SeniorIncomeTax{
	
	public int getIncomeTax() {
		return 20;
	}
}
	
public class MethodOverriding {
	
	public static void main(String[] args) {
	
		TraineeIncomeTax tit = new TraineeIncomeTax();
		AssoiateIncomeTax ait = new AssoiateIncomeTax();
		SeniorIncomeTax sit = new SeniorIncomeTax();
		System.out.println("Income tax of Trainee is : "+ tit.getIncomeTax());
		System.out.println("Income tax of Associate is : "+ ait.getIncomeTax());
		System.out.println("Income tax of Senior is : "+ sit.getIncomeTax());



	}

}
