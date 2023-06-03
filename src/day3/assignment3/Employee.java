package day3.assignment3;

public class Employee {
    private int salary;
    private int hourWorkPerDay;

    public Employee(int salary, int hourWorkPerDay) {
        this.salary = salary;
        this.hourWorkPerDay = hourWorkPerDay;
    }

    public String getInfo (){
        return "Salary: " + this.salary + "\n"
                +"Working hours per Day: " + this.hourWorkPerDay;
    }

    public void addSal(){
        if(this.salary < 500) {
            this.salary += 10;
        }
    }

    public void addWorks(){
        if (this.hourWorkPerDay > 6) {
            this.salary += 5;
        }
    }
}
