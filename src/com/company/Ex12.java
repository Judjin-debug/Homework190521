package com.company;


import java.io.IOException;

public class Ex12 {

    public static void main(String[] args) {
        int i = 0;
        String temp = "";
        try {
            while (i < 11) {
                temp = String.valueOf(factorial(i));
                System.out.println("Factorial of " + i + " equals to " + temp);
                i++;
            }
        } catch (IOException iex) {
            iex.printStackTrace();
        };
    };

    static double factorial (int number) throws IOException {

        if (number < 0) {
            throw new IOException("factorial of negative number is undefined");
        } else if (number == 0) {
            return 1;
        } else if (number == 1) {
            return 1;
        };

        return factorial(number - 1)  * number;
    };

}
