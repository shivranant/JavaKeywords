package returnKeyword;

public class Returning_value_from_method {
	    int add(int a, int b) {
	        return a + b;  // returns integer
	    }

	    public static void main(String[] args) {
	    	Returning_value_from_method obj = new Returning_value_from_method();
	        int sum = obj.add(5, 7);
	        System.out.println("Sum = " + sum);
	    }
	}

