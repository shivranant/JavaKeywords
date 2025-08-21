package returnKeyword;

public class ReturnRecursionExample {
    int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        ReturnRecursionExample obj = new ReturnRecursionExample();
        System.out.println("Factorial: " + obj.factorial(5));
        System.out.println("Factorial: " + obj.factorial(1));
    }
}
