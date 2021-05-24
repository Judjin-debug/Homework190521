package com.company;

import java.util.Scanner;

public class Ex6 {
    private static final SEVEN = "7";
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the number: ");
            String str = scan.next();
            System.out.print("Ends with seven? " + str.endsWith(SEVEN));
            scan.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    };

};
