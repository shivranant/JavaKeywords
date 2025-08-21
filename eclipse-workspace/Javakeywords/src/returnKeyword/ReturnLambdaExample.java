package returnKeyword;

import java.util.function.Function;

public class ReturnLambdaExample {
    public static void main(String[] args) {
        Function<Integer, String> checkEvenOdd = (n) -> {
            if (n % 2 == 0) return "Even";
            return "Odd";
        };

        System.out.println(checkEvenOdd.apply(10));
        System.out.println(checkEvenOdd.apply(7));
    }
}

