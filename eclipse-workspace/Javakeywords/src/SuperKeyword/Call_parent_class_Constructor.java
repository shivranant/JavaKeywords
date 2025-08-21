package SuperKeyword;

class Vehicles {
    Vehicles() {
        System.out.println("Vehicle constructor");
    }
}

class Cars extends Vehicles {
    Cars() {
        super(); 
        System.out.println("Car constructor");
    }
}

public class Call_parent_class_Constructor {
    public static void main(String[] args) {
        Car c = new Car();
    }
}

