package day5.assignment2;

public class Main {
    public static void main(String[] args) {
        A obj = new C();
        try {
            obj.method();
        }
        catch (BaseException e) {
            System.out.println(e.getMessage());
        }
    }
}
