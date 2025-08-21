package SuperKeyword;

interface Automobile {
    default void power() {
        System.out.println("Interface default power");
    }
}

class BMW implements Automobile {
    @Override
    public void power() {
        System.out.println("BMW power");
        Automobile.super.power(); // call interface default method
    }
}

public class Super_keyword_for_Interfaces {
    public static void main(String[] args) {
        new BMW().power();
    }
}

