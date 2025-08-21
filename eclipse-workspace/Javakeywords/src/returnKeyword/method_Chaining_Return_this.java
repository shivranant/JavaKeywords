package returnKeyword;

public class method_Chaining_Return_this {
    method_Chaining_Return_this sayHello() {
        System.out.println("Hello");
        return this;
    }

    method_Chaining_Return_this sayBye() {
        System.out.println("Bye");
        return this;
    }

    public static void main(String[] args) {
        new method_Chaining_Return_this().sayHello().sayBye();
    }
}
