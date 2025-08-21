package This_Keyword;

public class Assigning_values_To_Global_Variable {
	static int a;
	int b;

	void values(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add() {
		System.out.println(a + b);
	}

	void mul() {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Assigning_values_To_Global_Variable t = new Assigning_values_To_Global_Variable();
		t.values(100, 200);
		t.add();
		t.mul();
	}

}
