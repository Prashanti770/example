package example;

class Outer{
	
	static class Inner{
		static public void A() {
			System.out.println("Hi its Inner method");
		}
	}
public class StaticInnerClass {

	public static void main(String[] args) {
		
		//Outer out = new Outer();
		//Inner in = new Inner();
		Inner.A();

	}
}
}
