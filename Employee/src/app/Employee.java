package app;

public class Employee {
    private int id;
    private float salary;
    private PersonalInformation PersonalInfo; // COMPOSITION
    private Department dept; // AGGREGATION

    public Employee(int id, float salary, String fname, String mname, String lname, String bloodGroup, String accNum, String nationality, int yearOfBirth, Department dept) {
        this.id = id;
        this.salary = salary;
        this.PersonalInfo = new PersonalInformation(fname, mname, lname, bloodGroup, accNum, nationality, yearOfBirth);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", PersonalInfo=" + PersonalInfo +
                ", dept=" + dept +
                '}';
    }
}
