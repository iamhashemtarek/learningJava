package app;

public class Main {
    public static void main(String[] args) {
        Department dept = new Department(22, "cs");
        Employee emp = new Employee(1234, 10000, "hashem", "tarek", "mokhtar", "x", "1111", "egyption", 2000, dept);

        System.out.printf(emp.toString());
    }
}
