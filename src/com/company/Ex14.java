package com.company;

import java.io.IOException;

public class Ex14 {

    public static void main(String[] args) {
        long i = 7893823445l;
        String temp = "";
        temp = String.valueOf(digitSum(i));
        System.out.println("Sum of digits of " + i + " equals to " + temp);
        i++;
    };

    static int digitSum (long number) {
      char[] arr = String.valueOf(number).toCharArray();

      if (arr[0] == '-') {
        arr[0] = '0';
      };

      int result = 0;
      int i = 0;
      do {
          result += Character.getNumericValue(arr[i]);
          i++;
      } while (i < arr.length);
        return result;
    };

}
