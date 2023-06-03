package day4.practice;

public class Member {
    private String name;
    private String age;
    private String phoneNumber;
    private String address;
    private String salary;

    public Member(String name, String age, String phoneNumber, String address, String salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println(this.salary);
    }
}
