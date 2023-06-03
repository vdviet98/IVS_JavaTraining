package day4.practice;

public class Employee extends Member {
    private String specialization;
    private String department;

    public Employee(String name, String age, String phoneNumber, String address, String salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
}
