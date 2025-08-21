package SuperKeyword;

class Vehicless {
    String type = "Vehicle";
}

class Carss extends Vehicless {
    String type = "Car";

    void showType() {
        System.out.println(type);       // Car
        System.out.println(super.type); // Vehicle
    }
}

public class Call_Parent_Class_field {
    public static void main(String[] args) {
        new Carss().showType();
    }
}
