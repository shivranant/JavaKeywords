package SuperKeyword;

class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting...");
        super.start();
    }
}

public class Call_parent_Class_methods {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

