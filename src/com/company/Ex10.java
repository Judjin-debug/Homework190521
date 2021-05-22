package com.company;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex10 {
    public static void main(String[] args) {
        try {
            Integer token = 0;
            ArrayList<Integer> list = new ArrayList<>();
            File file = new File("src/Ex10Input.txt");
            Scanner scan = new Scanner(file).useDelimiter(",\\s*");
            while (scan.hasNext()) {
                token = Integer.parseInt(scan.next());
                if (token <= 0) {
                    System.out.println("Dimension can't be zero or negative");
                    return;
                };
                list.add(token);
            };
            Integer[] arr = list.toArray(new Integer[list.size()]);
            if (arr.length != 6) {
                System.out.println("Wrong size");
            } else {
                System.out.println("Will the houses fit: " + analyzeSpace(arr));
            };
        } catch (Exception ex) {
            ex.printStackTrace();
        };

    };

    static boolean analyzeSpace (Integer[] arr) {
        
        //arr[0] - first house length
        //arr[1] - first house width
        //arr[2] - second house length
        //arr[3] - second house width
        //arr[4] - yard length
        //arr[5] - yard width
        //condition 1: if the sum of house lengths is smaller than or equal to yard's length
        //             and individual house widths are smaller than or equal to yard's width
        //             then the houses will fit
        //for brevity De Morgran's laws were applied to reverse logical operators and
        //inequality signs
        //condition 2 is analogous, with length and width interchanged
        if (arr[0] + arr[2] > arr[4] || arr[1] > arr[5] || arr[3] > arr[5]) {
            return true;
        } else if (arr[1] + arr[3] > arr[5] || arr[2] > arr[4] || arr[0] > arr[4]) {
            return true;
        };
        return false;
    };


}
