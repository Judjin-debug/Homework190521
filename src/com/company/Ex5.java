package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the amount of seconds: ");
            Integer secs = scan.nextInt();
            Integer[] inArr = new Integer[5];
            inArr = timeFormat(secs);
            System.out.println("Displaying array elements: ");
            System.out.println(String.format("%02d", inArr[2]) + String.format(":%02d", inArr[1]) + String.format(":%02d", inArr[0]) + " " + inArr[3] + "d " + inArr[4] + "w");
            scan.close();
        } catch (Exception ex){
                ex.printStackTrace();
            };
    };

    static Integer[] timeFormat (Integer seconds) {
        Integer[] arr = new Integer[5];
        Integer temp = 0;
        arr[0] = seconds % 60;  //seconds
        temp = (seconds - arr[0]) / 60;
        arr[1] = temp % 60;
        temp = (temp - arr[1]) / 60;
        arr[2] = temp % 24;
        temp = (temp - arr[2]) / 24;
        arr[3] = temp % 7;
        arr[4] = (temp - arr[3]) / 7;
        return arr;
    };

};
