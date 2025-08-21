package This_Keyword;

public class Basic_Concept {
	int a = 10;
	int b = 20;
	String c="Neha ";
	String d="Monagoni";

	void add(int a, int b) 
	{
		System.out.println(a + b);
		System.out.println(this.a + this.b);
	}
	void add2(String c,String d)
	{
		System.out.println(c+d);
		System.out.println(this.c+this.d);
	}
	void add3(int b,String d)
	{
		System.out.println(b+d);
		System.out.println(this.b+this.d);
	}

	public static void main(String[] args) {
		Basic_Concept t = new Basic_Concept();
		t.add(100, 200);
		t.add2("Bharathwaj", "Rohan");
		t.add3(10, "Amulu");
	}

}
