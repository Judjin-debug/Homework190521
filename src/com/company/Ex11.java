package com.company;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Ex11 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the day: ");
            String str = scan.next();
            switch (str) {
                case "1":
                    weekDay();
                    return;
                case "2":
                    weekDay();
                    return;
                case "3":
                    weekDay();
                    return;
                case "4":
                    weekDay();
                    return;
                case "5":
                    weekDay();
                    return;
                case "6":
                    holiDay();
                    return;
                case "7":
                    holiDay();
                    return;
                case "default":
                    System.out.println("error");
            };
            System.out.println("IO error: wrong case");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    };

    static void weekDay () {
        System.out.println("5:50: Wake up");
        System.out.println("6:20: Have returnfast");
        System.out.println("6:50: GO-TO work");
        System.out.println("7:40: Reach work");
        System.out.println("8:00: Start working");
        System.out.println("15:00: GO-TO home");
        System.out.println("15:50: Reach home");
        System.out.println("16:00: Start making dinner");
        System.out.println("16:40: Eat dinner");
        System.out.println("17:20: GO-TO gym");
        System.out.println("19:20: GO-TO home");
        System.out.println("19:40: Start preparing for tomorrow");
        System.out.println("20:50: GO-TO sleep");
    };

    static void holiDay () {
        System.out.println("5:50: Wake up");
        System.out.println("6:20: Have returnfast");
        System.out.println("6:40: Doze off in front of PC");
        System.out.println("10:40: Start making dinner");
        System.out.println("12:00: Eat dinner");
        System.out.println("12:20: Doze off in front of PC again");
        System.out.println("21:00: GO-TO sleep");
    };

    //

}
