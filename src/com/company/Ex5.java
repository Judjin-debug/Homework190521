package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the amount of seconds: ");
            Integer timeInSeconds = scan.nextInt();
            printFormattedTime(timeInSeconds);
            scan.close();
        } catch (Exception ex){
                ex.printStackTrace();
            };
    };

    static void printFormattedTime(Integer timeInSeconds) {
        int sec = timeInSeconds % 60;
        int temp = (timeInSeconds - sec) / 60;
        int minutes = temp % 60;
        temp = (temp - minutes) / 60;
        int hours = temp % 24;
        temp = (temp - hours) / 24;
        int days = temp % 7;
        int weeks = (temp - days) / 7;
        System.out.printf("%d:%d:%d %d days %d weeks%n", hours, minutes, sec, days, weeks);
    }
    
    

};
