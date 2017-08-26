package inch;

class Base {
	void foo(int a) {
		System.out.println("Base");
	}
}

class Derived extends Base {
	@Override
	void foo(int a) {
		System.out.println("Derived");
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Derived();
		b.foo(5); // Derived.foo() will be activated
	}

}
