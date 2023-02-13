package example;
//Method overloading can be achieved by difference in the sequence of the parameters or Arguments

class Sequenceexample{
	public void svalues(int a, char b) {
		
		System.out.println("values of a & b are: "+ a +","+ b);
	}
	public void svalues(int a, char b,int c) {
		
		System.out.println("values of a & b &c are: "+ a +","+b +","+c);
	}
	public void svalues(char e, int b, double c, int d) {
		
		System.out.println("Values of e,b,c & d are: "+ e+","+b+","+c+","+d);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Sequenceexample s = new Sequenceexample();
		s.svalues(1, 'x');
		s.svalues(1, 'y', 3);
		s.svalues('z', 2, 4.56, 4);
	}

}
