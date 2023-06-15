package day6.assignment1;

import java.util.ArrayList;

public class ReplaceElement {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Original list: " + list);
        list.set(1, "Orange");
        System.out.println("Modified list: " + list);
    }
}
