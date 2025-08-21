package This_Keyword;

public class With_Constructor_Constructor_Chaining{
	With_Constructor_Constructor_Chaining() {
		this(10);
		System.out.println("0 arg");
	}

	With_Constructor_Constructor_Chaining(int a) {
		this(10, 20);
		System.out.println(a);
	}

	With_Constructor_Constructor_Chaining(int a, int b) {
		System.out.println(a + "--------" + b);
	}

	public static void main(String[] args) {
		With_Constructor_Constructor_Chaining t = new With_Constructor_Constructor_Chaining();
	}

}
