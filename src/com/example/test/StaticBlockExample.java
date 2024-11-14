package com.example.test;

public class StaticBlockExample {
	public static void main(String[] args) {
		System.out.println("Main Method");
		// Child.childStaticMethod();
		// Child child = new Child();
		//B obj = new B();
		//obj.a=9;
		// child.test(false, "");
		// child.j;
		// child.test();
		// child.j=9;
		// child.parentStaticMethod();
		// static
//		Child.i=23;
//		syso
		// instantiate
		// child.test2(false);

	}

}

class A {
	int a = 10;

	 static class B {
		 int b = 20;

		public B(int b) {
			super();
			this.b = b;
		}
		 
	}
}

class Parent {
	static int i = 99;

	public Parent() {
		System.out.println("in parent constructor");

	}

	public Parent(int a) {
		System.out.println("in parent constructor" + a);

	}
//	{
//		j=111;
//	}

	void test(boolean b, String d) {
		System.out.println("in parent");
		System.gc();
	}

//    public  void test(boolean b,String d) {
//    	System.out.println("Main Method test boolean double");
// }
	public final static void main(float[] args) {
		System.out.println("Main Method float");
	}

	static void parentStaticMethod() {
		try {
			System.out.println("parentStaticMethod m");
			// System.exit(200);
			for (int i = 0; i < 2;) {

			}
			// int v=1/0;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("parentStaticMethod finally");

		}
	}

}

class Child extends Parent {
	public Child() {
		super(2);
		System.out.println("in Child constructor");

	}

	@Override
	void test(boolean b, String e) {
		super.test(b, e);
		System.out.println("Main Method test boolean double ch");
	}

	public void test2(boolean b) {
		System.out.println("Main Method test boolean double ch");
	}
//@Override
//	static void parentStaticMethod() {
//		System.out.println("parentStaticMethod child");
//	}

	// static int i=100;
	// public int j = 10;

	static void childStaticMethod() {

	}

}