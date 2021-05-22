package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the numbers: ");
        System.out.print("Radius: ");
        Double num1 = Double.parseDouble(scan.next());
        if (num1 < 0) {
          throw new IOException("Length can't be negative");
        };
        System.out.print("Side a of rectangle: ");
        Double num2 = Double.parseDouble(scan.next());
        if (num2 < 0) {
            throw new IOException("Length can't be negative");
        };
        System.out.print("Side b of rectangle: ");
        Double num3 = Double.parseDouble(scan.next());
        if (num3 < 0) {
            throw new IOException("Length can't be negative");
        };
        System.out.print("Displaying the result: " + doesCloseRect(num1, num2, num3));
        scan.close();
    };

    static boolean doesCloseRect (Double r, Double a, Double b) {
        if (r < 0.5*Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) {
            return false;
        } else
            return true;
    };

};