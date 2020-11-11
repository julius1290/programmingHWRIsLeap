package main;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class MainClass {


    public static void main(String[] args) throws Exception {
        //System.out.println(getValueSwing());
        //System.out.println(getValueStream());
        //leapYearTest();
        forLoop();
    }

    private static void leapYearTest() throws IOException {
        int year = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("is leap with Algebra and Calender test? Answer: " + isLeapWithAlgebra(year));
        System.out.println("is leap with if-Statement? Answer: " + isLeapWithIfStatement(year));
    }

    public static int getValueSwing() {
        return Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
    }

    public static int  getValueStream() throws NumberFormatException, IOException {
        System.out.println("Please enter a number: ");
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    private static boolean isLeapWithIfStatement(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0)
                return true;
            if (year % 400 == 0)
                return true;
        }
        return false;
    }

    private static boolean isLeapWithAlgebra(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) && new GregorianCalendar().isLeapYear(year);
    }

    private static void forLoop() {
        for (int i = 100; i >= 0; i--) {
            System.out.print("Zahl: " + i + "        ");
            if (i % 2 == 0)
                System.out.print("Quadratzahl: " + i * i + "       ");
            System.out.println("2-er Potenz: " + Math.pow(2, i));
        }
    }



}


