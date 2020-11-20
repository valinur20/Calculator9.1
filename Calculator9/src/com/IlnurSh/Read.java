package com.IlnurSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    int num1;
    int num2;
    String str;

    public void read() {
        String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = reader.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String[] res = str.split("[+-/*]");

        char result = str.charAt(res[0].length());

        try {
            for (String value : arabic) {
                if (value.equals(res[0]) || value.equals(res[1])) {
                    num1 = Integer.parseInt(res[0]);
                    num2 = Integer.parseInt(res[1]);
                }
            }
            for (String s : roman) {
                if (s.equals(res[0]) || s.equals(res[1])) {
                    num1 =romanToNumber(res[0]);
                    num2 =romanToNumber(res[1]);
                }
            }
            if((num1 > 10 || num1 <= 0) || (num2 > 10 || num2 <= 0)) {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Неверный формат данных");

        }

        Calculator calc = new Calculator();
        System.out.println("Ответ");
        System.out.println(calc.calculate(num1, num2, result));
    }
    public static int romanToNumber(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }
}
