package This_keyword;

public class Return_Current_Object_method_chaining {
	Return_Current_Object_method_chaining setName(String name) {
        System.out.println("Name: " + name);
        return this;
    }

	Return_Current_Object_method_chaining setAge(int age) {
        System.out.println("Age: " + age);
        return this;
    }

    public static void main(String[] args) {
        new Return_Current_Object_method_chaining().setName("Shiv").setAge(30); // method chaining
    }

}
