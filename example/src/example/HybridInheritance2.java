package example;
//Hierarchical and multi-level Inheritance
class A {
	public void methoda() {
		System.out.println("Its A");
	}
}
class B extends A{
	public void methodb() {
		System.out.println("Its B");
	}
}

class C extends A{
	public void methodc() {
		System.out.println("Its C");
	}
}
class D extends B{
	public void methodd() {
		System.out.println("Its D");
	}
}
class E extends D {
	public void methode() {
		System.out.println("Its E");
	}
}
public class HybridInheritance2 {

	public static void main(String[] args) {
		System.out.println("****");
		A a =new A();
		a.methoda();
		System.out.println("****"); //B inherits properties from A
		B b =new B();
		b.methoda();
		b.methodb();
		System.out.println("****");//C inherits properties from A
		C c =new C();
		c.methoda();
		c.methodc();
		System.out.println("****");//D inherits properties from B,A
		D d = new D();
		d.methoda();
		d.methodb();
		d.methodd();
		System.out.println("****");//E inherits properties from B,A
		E e = new E();
		e.methoda();
		e.methodb();
		e.methodd();
		e.methode();
	}

}
