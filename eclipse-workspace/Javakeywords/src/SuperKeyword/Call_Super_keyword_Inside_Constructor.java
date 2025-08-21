package SuperKeyword;
class Vehiclesss {
    Vehiclesss(String name) {
        System.out.println("Vehicle: " + name);
    }
}

class Carsss extends Vehiclesss {
    Carsss(String name) {
        super(name); // pass value to parent constructor
        System.out.println("Car: " + name);
    }
}

public class Call_Super_keyword_Inside_Constructor {
    public static void main(String[] args) {
        new Carsss("BMW");
    }
}
