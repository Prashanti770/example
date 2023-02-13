package example;
//When two or more classes inherits a single class, it is known as hierarchical inheritance
class Transportation{
	public void goods() {
		System.out.println("transport goods to places");
	}
}
class Aeroplane extends Transportation{
	public void fly() {
		System.out.println("uses fuel to fly in sky");
	}
}
class Ship extends Transportation{
	public void sail() {
		System.out.println("uses fuel to sail on water");
	}
}
public class Hierarchicalnheritance {

	public static void main(String[] args) {
		System.out.println("###Parent - Transportation class object creation###");
		Transportation t = new Transportation();
		t.goods();
		System.out.println("###Child 1- Aeroplane class object creation###");
		Aeroplane a = new Aeroplane();
		a.fly();
		a.goods();
		System.out.println("###Child 2- Ship class object creation###");
		Ship s = new Ship();
		s.goods();
		s.sail();
	}
}
