package example;
//single and hierarchical inheritance
class Grandfather{
	public void showG() {
		System.out.println("He is Grand father");
	}
}
class Father extends Grandfather{
	public void showF() {
		System.out.println("He is father");
	}
}
class Son extends Father{
	public void showS() {
		System.out.println("He is Son");
	}
}
class Daughter extends Father{
	public void showD() {
		System.out.println("She is Daughter");
	}
}
public class HybridInheritance1 {
	
	public static void main(String[] args) {
		System.out.println("******");
		Grandfather g = new Grandfather();
		g.showG();
		System.out.println("******");
		Father f = new Father();
		f.showF();
		f.showG();
		System.out.println("******");
		Son s = new Son();
		s.showG();
		s.showF();
		s.showS();
		System.out.println("******");
		Daughter d = new Daughter();
		d.showG();
		d.showF();
		d.showD();

	}

}
