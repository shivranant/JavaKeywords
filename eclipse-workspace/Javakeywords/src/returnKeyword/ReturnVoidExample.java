package returnKeyword;

public class ReturnVoidExample {
    void checkPositive(int num) {
        if (num < 0) {
            System.out.println("Negative number");
            return;   // exit early
        }
        System.out.println("Positive number");
    }

    public static void main(String[] args) {
        ReturnVoidExample obj = new ReturnVoidExample();
        obj.checkPositive(-10);
        obj.checkPositive(20);
    }
}

