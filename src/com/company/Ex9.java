package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) throws IOException {
        try {
            Integer[] arr = new Integer[3];
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the day: ");
            arr[0] = Integer.parseInt(scan.next());
            if (arr[0] <= 0) {
                // Выбрал не то исклбчение. IOException вводит в заблуждение.
                // IOException означает что проблема в потоках ввода вывода, например не читается файл или не вводится из консоли.
                // Тут всего лишь на вход функции пришёл невалидный аргумент - IllegalArgumentException, просто RuntimeException с сообщением, свой кастомный класс например InvalidDateException
                throw new IOException("Day can't be negative or zero");
            };
            if (arr[0] > 31) {
                throw new IOException("Day is out of ANY month bounds");
            };
            System.out.println("Input the month: ");
            arr[1] = Integer.parseInt(scan.next());
            if (arr[1] <= 0) {
                throw new IOException("Month can't be negative or zero");
            };
            if (arr[1] > 12) {
                throw new IOException("Month is out of bounds");
            };
            System.out.println("Input the year: ");
            // дичь, не надо в массивах хранить значения разной природы - месяцы, дни и года например.
            // как бы ты держал в голове под каким индексом какая переменная?
            // я к этой строчке уже забыл и приходится возвращаться назад и перечитывать код.
            if ((arr[1] == 1 && arr[0] > 31) || (arr[1] == 2 && arr[0] > 29) || (arr[1] == 3 && arr[0] > 31)
                 || (arr[1] == 4 && arr[0] > 30) || (arr[1] == 5 && arr[0] > 31)
                    || (arr[1] == 6 && arr[0] > 30) || (arr[1] == 7 && arr[0] > 31)
                    || (arr[1] == 8 && arr[0] > 31) || (arr[1] == 9 && arr[0] > 30)
                    || (arr[1] == 10 && arr[0] > 31) || (arr[1] == 11 && arr[0] > 30)
                    || (arr[1] == 12 && arr[0] > 31)) {
                throw new IOException("Day is out of month bounds");
            };
            arr[2] = Integer.parseInt(scan.next());
            if (arr[2] < 0) {
                throw new IOException("Year can't be negative");
            };
            // это должно быть в функции resolveNextDate
            //checking the leap year
            if ((arr[2] % 4 != 0) && (arr[1] == 2) && (arr[0] == 29)) {
                throw new IOException("29'th of February can only be in a leap year");
            };
            
            scan.close();
            Integer[] temp = resolveNextDate(arr);
            System.out.println(temp[0] + "-" + temp[1] + "-" + temp[2]);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    };
    // отличное имя)
    static Integer[] resolveNextDate (Integer[] arr) {
        Integer[] temp = new Integer[3];

        //new year
        if (arr[0] == 31 && arr[1] == 12) {
            temp[0] = 1;
            temp[1] = 1;
            temp[2] = arr[2] + 1;
            return temp;
        };

        //new month
        //January
        if (arr[0] == 31 && arr[1] == 1) {
            temp[0] = 1;
            temp[1] = 2;
            temp[2] = arr[2];
            return temp;
        };

        //February
        if ((arr[0] == 28 && arr[1] == 2 && arr[2] % 4 != 0) || (arr[0] == 29 && arr[1] == 2 && arr[2] % 4 == 0)){
            temp[0] = 1;
            temp[1] = 3;
            temp[2] = arr[2];
            return temp;
        };

        //March
        if (arr[0] == 31 && arr[1] == 3) {
            temp[0] = 1;
            temp[1] = 4;
            temp[2] = arr[2];
            return temp;
        };

        //April
        if (arr[0] == 30 && arr[1] == 4) {
            temp[0] = 1;
            temp[1] = 5;
            temp[2] = arr[2];
            return temp;
        };

        //May
        if (arr[0] == 31 && arr[1] == 5) {
            temp[0] = 1;
            temp[1] = 6;
            temp[2] = arr[2];
            return temp;
        };

        //June
        if (arr[0] == 30 && arr[1] == 6) {
            temp[0] = 1;
            temp[1] = 7;
            temp[2] = arr[2];
            return temp;
        };

        //July
        if (arr[0] == 31 && arr[1] == 7) {
            temp[0] = 1;
            temp[1] = 8;
            temp[2] = arr[2];
            return temp;
        };

        //August
        if (arr[0] == 31 && arr[1] == 8) {
            temp[0] = 1;
            temp[1] = 9;
            temp[2] = arr[2];
            return temp;
        };

        //September
        if (arr[0] == 30 && arr[1] == 9) {
            temp[0] = 1;
            temp[1] = 10;
            temp[2] = arr[2];
            return temp;
        };

        //October
        if (arr[0] == 31 && arr[1] == 10) {
            temp[0] = 1;
            temp[1] = 11;
            temp[2] = arr[2];
            return temp;
        };

        //November
        if (arr[0] == 30 && arr[1] == 11) {
            temp[0] = 1;
            temp[1] = 12;
            temp[2] = arr[2];
            return temp;
        };

        //December is skipped (see NY)

        //increment the day (the only case that's left)
        temp[0] = arr[0] + 1;
        temp[1] = arr[1];
        temp[2] = arr[2];
        return temp;

    };


};
