package This_keyword;

public class Difference_Between_Local_Instance_variable {
	String name;
    int age;

    Difference_Between_Local_Instance_variable(String name, int age) {
        this.name = name;   // instance variable
        this.age = age;     // local variable (constructor parameter)
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
    	Difference_Between_Local_Instance_variable s1 = new Difference_Between_Local_Instance_variable("Shiv", 30);
        s1.display();
    }
}

