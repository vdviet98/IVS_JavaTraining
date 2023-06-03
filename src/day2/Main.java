package day2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*
        Write a Java program to print the result of the following operations.
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13
*/
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        /*    Write a Java program to takes the user for a distance (in meters)
    and the time was taken (as three numbers: hours, minutes, seconds),
    and display the speed, in meters per second, kilometers per hour and miles per hour
    (hint: 1 mile = 1609 meters).
    Test Data
    Input distance in meters: 2500
    Input hour: 5
    Input minutes: 56
    Input seconds: 23
    Expected Output :
    Your speed in meters/second is 0.11691531
    Your speed in km/h is 0.42089513
    Your speed in miles/h is 0.26158804*/
        System.out.print("Input distance in metters ");
        double distanceInMeters = inputpPositiveNumber();
        System.out.print("Input hour: ");
        double hour = inputpPositiveNumber();
        System.out.print("Input minutes: ");
        double minute = inputpPositiveNumber();
        System.out.print("Input Seconds: ");
        double second = inputpPositiveNumber();
        System.out.println("Output:");
        System.out.println("Your speed in meters/second is " + distanceInMeters / (hour * 3600 + minute * 60 + second));
        System.out.println("Your speed in km/h is " + 3.6 * (distanceInMeters / (hour * 3600 + minute * 60 + second)) );
        System.out.println("Your speed in miles/hr is " + 1.609 * (3.6 * (distanceInMeters / (hour * 3600 + minute * 60 + second))));
    }


    public static double inputpPositiveNumber() {
        int num;
        do {
            System.out.print(" (Positive number only): ");
            num = new Scanner(System.in).nextInt();
        } while (num <= 0);
        return num;
    }
}