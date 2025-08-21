package This_keyword;

public class Pass_CurrentObject_As_parameter_2 {
    void show(Pass_CurrentObject_As_parameter obj) {
        System.out.println("Show method called");
    }
    public static void main(String[] args) {
    	Pass_CurrentObject_As_parameter a = new Pass_CurrentObject_As_parameter();
        a.call();
    }
}
