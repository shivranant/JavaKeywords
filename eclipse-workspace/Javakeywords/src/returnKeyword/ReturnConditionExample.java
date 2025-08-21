package returnKeyword;

public class ReturnConditionExample {
    String getGrade(int marks) {
        if (marks >= 90) return "Firstclass";
        if (marks >= 75) return "Secondclass";
        if (marks >= 50) return "Passed";
        return "Fail";
    }

    public static void main(String[] args) {
        ReturnConditionExample obj = new ReturnConditionExample();
        System.out.println(obj.getGrade(85));
    }
}

