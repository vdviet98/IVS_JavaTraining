package day4.practice;

public class Manager extends Member {
    private String specialization;
    private String department;

    public Manager(String name, String age, String phoneNumber, String address, String salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
}
