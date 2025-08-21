package SuperKeyword;

class Vehiclessss {
    void run1() { System.out.println("Vehicle runs"); }
}

class Carssss extends Vehiclessss {
    @Override
    void run1() {
        super.run1(); // call parent before/after customization
        System.out.println("Car runs faster");
    }
}

public class For_method_overriding {
    public static void main(String[] args) {
        Vehiclessss v = new Carssss();
        v.run1();
    }
}

