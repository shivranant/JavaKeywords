package returnKeyword;

public class ReturnThisExample {
    ReturnThisExample sayHello() {
        System.out.println("Hello");
        return this;
    }

    ReturnThisExample sayBye() {
        System.out.println("Bye");
        return this;
    }

    public static void main(String[] args) {
        new ReturnThisExample().sayHello().sayBye();
    }
}

