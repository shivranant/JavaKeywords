package This_keyword;

public class Constructor_chainingUsing_This {
    String brand;
    int year;

    Constructor_chainingUsing_This() {
        this("Unknown", 2000); // calling another constructor
    }

    Constructor_chainingUsing_This(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Car: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
    	Constructor_chainingUsing_This c1 = new Constructor_chainingUsing_This();
    	Constructor_chainingUsing_This c2 = new Constructor_chainingUsing_This("Toyota", 2022);

        c1.display();
        c2.display();
    }
}


