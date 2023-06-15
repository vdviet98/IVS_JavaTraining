package day7.practice;

import java.io.*;
import java.util.Scanner;

public class NumberFilter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        try {
            fw = new FileWriter("numbers.txt");
            System.out.println("Enter 20 integers:");
            for (int i = 0; i < 20; i++) {
                int num = sc.nextInt();
                fw.write(String.valueOf(num) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        FileInputStream fis = null;
        PrintWriter pwOdd = null;
        PrintWriter pwEven = null;
        try {
            fis = new FileInputStream("numbers.txt");
            pwOdd = new PrintWriter(new FileOutputStream("odd.txt"));
            pwEven = new PrintWriter(new FileOutputStream("even.txt"));
            Scanner scFile = new Scanner(fis);
            while (scFile.hasNextInt()) {
                int num = scFile.nextInt();
                if (num % 2 == 0) {
                    pwEven.println(num);
                } else {
                    pwOdd.println(num);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (pwOdd != null) {
                pwOdd.close();
            }
            if (pwEven != null) {
                pwEven.close();
            }
        }
    }
}