package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex15 {

    public static void main(String[] args) {
        try {
            //intArrOut(eraSieve(rangeGenerator(50, 70)));
            brokenIntArrOut(eraSieve(rangeGenerator(50, 70)));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    };

    static int[] eraSieve (int[] inArr) throws RuntimeException{

        //zeroNegOneFilter gets rid of array elements that are < 2 and returns a reduced array without them
        int[] arr = zeroNegOneFilter(inArr);

        if ((arr.length == 0) || (arr == null))
            return null;

        try {
            int max = maxValue(arr);
            //primeCheck returns the numbers the input array will be sieved with
            //for example: if max value of array is 100, numbers will be 2, 3, 5, 7 (<= 10)
            //(10 is a sqrt(100))
            int[] sieve = primeCheck(max);

            //priDivCheck turns the number values to zero if they get divided
            //by a prime number from int[] sieve
            for (int i = 0; i < sieve.length; i++) {
                arr = priDivCheck(arr, sieve[i]);
            };

            //and then zeroNegOneFilter gets rid of the zeroes that appeared during the loop inside arr
            int[] result = zeroNegOneFilter(arr);
            return result;

        } catch (IOException iex) {
            iex.printStackTrace();
        };

        throw new RuntimeException("method eraSieve failed");

    };

    static int maxValue (int[] arr) throws IOException {

        if (arr == null)
            throw new IOException("maxValue method error: array is null");

        if (arr.length == 0)
            throw new IOException("maxValue method error: array has zero length");

        if (arr.length == 1)
            return arr[0];

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            };
        };

        return temp;
    };

    static int[] primeCheck (int max) {

        //the actual numbers to sieve with are <= sqrt(max)
        int maxPri = (int) Math.floor(Math.sqrt(max));

        int[] temp = new int[maxPri - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 2;
        };

        for (int i = 0; i < temp.length; i++) {
            temp = priDivCheck(temp, temp[i]);
        };

        int[] result = zeroNegOneFilter(temp);
        return result;
    };

    static int[] priDivCheck(int[] inArr, int pri) {

        // скобки
        if (pri == 0)
            return inArr;

        int[] arr = Arrays.copyOf(inArr, inArr.length);

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != pri) && (arr[i]  % pri == 0)) {
                arr[i] = 0;
            };
        };

        return arr;

    };

    // зачем? 
// Arrays.stream(array).filter(i -> i > 1).toArray();
    static int[] zeroNegOneFilter (int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                list.add(Integer.valueOf(arr[i]));
            };
        };

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;

    };

    static int[] rangeGenerator (int start, int finish) {
        int[] result = new int[finish - start + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + start;
        };
        return result;
    };

    static void intArrOut (int[] arr) {
        System.out.println("Displaying array: ");
      for (int i : arr) {
          System.out.print(" " + i);
      };
    };

    // что это
    static void brokenIntArrOut (int[] arr) {
        System.out.println("Displaying array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            if (i == 1)
                break;
        };
    };

}
