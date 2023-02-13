package example;
class X {
	public void methoda() {
		System.out.println("Its A");
	}
}
class Y extends X{
	public void methodb() {
		System.out.println("Its B");
	}
}
class Z extends Y{
	public void methodd() {
		System.out.println("Its D");
	}
}
class Q extends Z {
	public void methode() {
		System.out.println("Its E");
	}
}
public class HybridInheritance3 {

	public static void main(String[] args) {
		System.out.println("****");
		X a =new X();
		a.methoda();
		System.out.println("****"); //B inherits properties from A
		Y b =new Y();
		b.methoda();
		b.methodb();
		System.out.println("****");//D inherits properties from B,A
		Z d = new Z();
		d.methoda();
		d.methodb();
		d.methodd();
		System.out.println("****");//E inherits properties from B,A
		Q e = new Q();
		e.methoda();
		e.methodb();
		e.methodd();
		e.methode();

	}

}
