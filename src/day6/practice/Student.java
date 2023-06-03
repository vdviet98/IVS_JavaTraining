package day6.practice;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private String age;
    private String GPA;

    public Student(String name, String age, String GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", GPA='" + GPA + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        ArrayList<Student> listStudentVIP = new ArrayList<>();

        Student s1 = new Student("Viet1", "18", "3.5");
        Student s2 = new Student("Viet2", "18", "3.5");
        Student s3 = new Student("Viet3", "18", "0.5");
        Student s4 = new Student("Viet4", "18", "1.5");
        Student s5 = new Student("Viet5", "18", "2.5");
        Student s6 = new Student("Viet6", "18", "0.5");
        Student s7 = new Student("Viet7", "18", "0.5");
        Student s8 = new Student("Viet8", "18", "4.5");
        Student s9 = new Student("Viet9", "18", "3.5");
        Student s10 = new Student("Viet10", "18", "3.5");
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);
        listStudent.add(s5);
        listStudent.add(s6);
        listStudent.add(s7);
        listStudent.add(s8);
        listStudent.add(s9);
        listStudent.add(s10);

        listStudent.forEach(student -> {
            System.out.println(student.toString());
            if (Double.parseDouble(student.GPA) >= 2.0) {
                listStudentVIP.add(student);
            }
        });
        System.out.println("---------------------------------");
        listStudentVIP.forEach(vip -> {
            System.out.println(vip.toString());
        });

    }
}
