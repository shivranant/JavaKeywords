package returnKeyword;

public class ReturnNullExample {
    String fetchName(boolean flag) {
        if (flag) return "Neha";
        else return null;
    }

    public static void main(String[] args) {
        ReturnNullExample obj = new ReturnNullExample();
        System.out.println(obj.fetchName(true));
        System.out.println(obj.fetchName(false));
    }
}

