package returnKeyword;

public class ReturnConstructorExample {
    ReturnConstructorExample(boolean flag) {
        if (!flag) {
            System.out.println("Exiting constructor early");
            return;   // just exits constructor
        }
        System.out.println("Constructor completed");
    }

    public static void main(String[] args) {
        new ReturnConstructorExample(false);
        new ReturnConstructorExample(true);
    }
}

