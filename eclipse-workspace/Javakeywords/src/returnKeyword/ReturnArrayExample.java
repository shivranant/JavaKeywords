package returnKeyword;

public class ReturnArrayExample {
    int[] generateNumbers() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static void main(String[] args) {
        ReturnArrayExample obj = new ReturnArrayExample();
        for (int n : obj.generateNumbers()) {
            System.out.print(n + " ");
        }
    }
}

