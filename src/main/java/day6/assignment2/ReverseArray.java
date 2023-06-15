package day6.assignment2;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = new int[64];
        for (int i = 1; i <= 64; i++) {
            array[i - 1] = i;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
