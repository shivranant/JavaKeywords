package returnKeyword;

class StudentObject {
    String name;
    StudentObject(String name) { this.name = name; }
}

public class ReturnObjectExample {
    StudentObject createStudent() {
        return new StudentObject("Shivkrishna");
    }

    public static void main(String[] args) {
        ReturnObjectExample obj = new ReturnObjectExample();
        StudentObject s = obj.createStudent();
        System.out.println("Student: " + s.name);
    }
}

