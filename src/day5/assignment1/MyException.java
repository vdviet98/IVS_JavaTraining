package day5.assignment1;
class MyException extends Exception {
    private String message;

    public MyException() {
        this.message = "U La Troi";
    }

    public void printMessage() {
        System.out.println(message);
    }

    public static void test(String n) throws MyException {
        if (Integer.parseInt(n) < 0) {
            throw new MyException();
        } else {
            System.out.println("Positive number: " + n);
        }
    }


    public static void main(String[] args) {
        try {
            test("10");
            test("-19");
        } catch (MyException e) {
            e.printMessage();
        }
    }
}

