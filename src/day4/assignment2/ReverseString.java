package day4.assignment2;

public class ReverseString implements CharSequence {

    private String original; // The original string
    public ReverseString(String original) {
        this.original = original;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return original.charAt(length() - 1 - index);
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end < 0 || start > end || end > length()) {
            throw new IndexOutOfBoundsException("Invalid range: " + start + " to " + end);
        }
        return new ReverseString(original.substring(length() - end, length() - start));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = length() - 1; i >= 0; i--) {
            sb.append(original.charAt(i));
        }
        return sb.toString();
    }
}

