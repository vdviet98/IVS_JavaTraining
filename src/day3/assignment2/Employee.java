package day3.assignment2;

public class Employee {
    private String name;
    private String yearOfJoining;
    private String address;
    private String salary;

    public Employee(String name, String yearOfJoining, String address, String salary){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
        this.salary = salary;
    }

    public String getEmployee(){
        return this.name + "\t\t" + this.yearOfJoining + "\t\t\t"
                + this.address +"\t\t" + this.salary;
    }
}
