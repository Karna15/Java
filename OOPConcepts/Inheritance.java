package OOPConcepts;

public class Inheritance {

	public static void main(String[] args) {

		Child pt = new Child();
		pt.Method();
		pt.Method1();
	}

}

class Parent {

	public void Method() {
		System.out.println("Parent class method");
	}

}

class Child extends Parent {

	public void Method1() {
		System.out.println("Child class method");
	}

}
