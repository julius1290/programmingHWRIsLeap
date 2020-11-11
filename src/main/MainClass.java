package main;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

    private static final Logger logger = Logger.getLogger(MainClass.class.getName());

    public static void main(String[] args) throws Exception {
        MainClass newClass = new MainClass();
        //logger.log(Level.INFO, "{0}", newClass.getValueSwing());
        //logger.log(Level.INFO, "{0}", newClass.getValueStream());
        int year = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        boolean isLeap = newClass.isLeap(year);
        logger.log(Level.INFO, "is leap? Answer: {0}", isLeap);
    }

    public int getValueSwing() {
        return Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
    }

    public int  getValueStream() throws NumberFormatException, IOException {
        logger.log(Level.INFO, "Please enter a number: ");
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    private boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0));
    }
}


