package day3.assignment1;

import java.util.Scanner;
public class Main {
/*    Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
    of its length and breadth as parameters of its constructor and having a method named 'returnArea'
    which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        sc.close();
        Area a = new Area(l, b);
        System.out.println("The area of the rectangle is: " + a.returnArea());
    }
}