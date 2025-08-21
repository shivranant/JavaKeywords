package SuperKeyword;

public class FailScenarios {
//1. super in static methods	
	class Vehicle {
	    static void info() {}
	}

	class Car extends Vehicle {
	    static void test() {
	        // super.info(); ❌ Not allowed
	    }
	}
	
//2. super in main method directly
	
	class Cars {
	    public static void main(String[] args) {
	        // super.toString(); ❌ Compilation error
	    }
	}

//3. super to call grandparent directly
	
	class Vehicless { void run() {} }
	class Carss extends Vehicless { void run() {} }
	class BMW extends Car {
	    void run() {
	        // super.super.run(); ❌ Not allowed
	    }
	}


}
