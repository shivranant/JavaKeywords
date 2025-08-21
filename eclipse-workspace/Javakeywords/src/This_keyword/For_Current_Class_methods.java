package This_keyword;

public class For_Current_Class_methods {
	void display() {
        System.out.println("Hello from display()");
    }

    void show() {
        this.display(); // explicitly calling method
    }

    public static void main(String[] args) {
    	For_Current_Class_methods d = new For_Current_Class_methods();
        d.show();
    }
}

