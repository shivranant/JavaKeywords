package This_keyword;

public class Access_Outer_Class_using_This {
    void outerMethod() {
        System.out.println("Outer class method");
    }

    class Inner {
        void innerMethod() {
        	Access_Outer_Class_using_This.this.outerMethod(); // calling outer method
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args) {
    	Access_Outer_Class_using_This outer = new Access_Outer_Class_using_This();
    	Access_Outer_Class_using_This.Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}

