package example;
//Method overloading can be achieved by difference in the number of parameters

class Multiplication{
	public void mul(int a, int b) {
		int x = a*b;
		System.out.println("multiplication of a & b is: "+ x);
	}
	public void mul(int a, int b,int c) {
		int x = a*b*c;
		System.out.println("multiplication of a & b &c is: "+ x);
	}
	public void mul(int e, int b, int c, int d) {
		int x = e*b*c*d;
		System.out.println("multiplication of e,b,c & d is: "+ x);
	}
}

public class MethodOverloading1 {
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.mul(1, 2);
		m.mul(1, 2, 3);
		m.mul(1, 2, 3, 4);
		
	}

}
