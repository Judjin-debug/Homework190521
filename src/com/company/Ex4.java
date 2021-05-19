package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the numbers: ");
            System.out.print("Number 1: ");
            Integer num1 = Integer.parseInt(scan.next());
            System.out.print("Number 2: ");
            Integer num2 = Integer.parseInt(scan.next());
            System.out.print("Displaying the result: " + expr(num1, num2));
            scan.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    };

    static Integer expr (Integer num1, Integer num2) {
        return (num1 + num2) + (num1 * num2);
    }

};
