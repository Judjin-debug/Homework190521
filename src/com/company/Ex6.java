package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the number: ");
            String str = scan.next();
            System.out.print("Displaying the result: " + check(str));
            scan.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    };

    static boolean check (String str) {
        return ( Integer.parseInt(str.substring(str.length()-1)) == 7);
    };


};
