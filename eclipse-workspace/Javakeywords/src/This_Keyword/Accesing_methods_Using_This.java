package This_Keyword;

public class Accesing_methods_Using_This {
	void m1() {
		this.m2();
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		Accesing_methods_Using_This t = new Accesing_methods_Using_This();
		t.m1();
	}

}
