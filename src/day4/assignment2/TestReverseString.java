package day4.assignment2;

public class TestReverseString {

    public static void main(String[] args) {
        String originalString =
                "Write a class that implements the CharSequence interface found in the java.lang package." +
                " Your implementation should return the string backwards." +
                " Select one of the sentences from this book to use as the data. " +
                "Write a small main method to test your class; make sure to call all four methods.";
        ReverseString rs = new ReverseString(originalString);

        System.out.println("The string length is: " + rs.length());
        System.out.println("The character at index 5 is: " + rs.charAt(5));
        System.out.println("The subsequence from index 10 to 20 is: " + rs.subSequence(10, 20));
        System.out.println("The string is: " + rs.toString());
    }
}
