package example;
//Method overloading can be achieved by difference in the data types of the parameters or Arguments

class Display{
	public void dvalues(int a, char b) {
		
		System.out.println("values of a & b are: "+ a +","+ b);
	}
	public void dvalues(int a, char b,int c) {
		
		System.out.println("values of a & b &c are: "+ a +","+b +","+c);
	}
	public void dvalues(char e, int b, char c, int d) {
		
		System.out.println("Values of e,b,c & d are: "+ e+","+b+","+c+","+d);
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {

		Display d = new Display();
		d.dvalues(1, 'x');
		d.dvalues(1, 'y', 3);
		d.dvalues('z', 2, 'm', 4);
		
	
	}

}
