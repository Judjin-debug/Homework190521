package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the number: ");
            String str = scan.next();
            System.out.println("Summa deneg " + str + " " + check(str));
            scan.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    };

    static String check (String str) throws IOException {
        try {
            Integer temp = Integer.parseInt(str);

            if (str.length() > 1) {
                if (str.substring(str.length() - 2, str.length() - 1).equals("1") == true) {
                    return "rubley";
                };
            };
            Integer last = Integer.parseInt(str.substring(str.length() - 1));
            return check2(last);
        } catch (Exception ex) {
            ex.printStackTrace();
        };

        return "rubley";
    };

    static String check2 (Integer num) {
        if (num == 0) return "rubley";
        if (num == 1) return "rubl";
        if (num > 1 && num < 5) return "rublya";
        return "rubley";
    };
}
