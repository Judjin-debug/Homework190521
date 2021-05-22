package com.company;

public class Ex17 {

    public static void main(String[] args) {
        System.out.println(numFormat(20023143));
    };

    static String numFormat (int input) {
        String str = String.valueOf(input);
        //reverse loop
        int temp = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            if (temp == 2) {
              str = str.substring(0, i) + " " + str.substring(i, str.length());
            };
            temp = (temp + 1) % 3;
        };

        return str;
    };

}
