package This_keyword;

public class Pass_CurrentObject_As_parameter {
	    void display(Pass_CurrentObject_As_parameter_2 obj) {
	        System.out.println("Display method called");
	    }

	    void call() {
	    	Pass_CurrentObject_As_parameter_2 b = new Pass_CurrentObject_As_parameter_2();
	        b.show(this); // passing current object
	    }
	}



