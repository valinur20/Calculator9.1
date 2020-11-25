package com.IlnurSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    int num1;
    int num2;
    String str;
    public   String lang_key = "arabic";
    public int result_calc;
    private converResRom my_converResRom;

    public void read() {
        my_converResRom = new converResRom();

        String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        this.lang_key = "arabic";
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
        this.result_calc = calc.calculate(num1, num2, result);
        System.out.println(show_result_calc( this.lang_key,this.result_calc));

    }

    public String show_result_calc(String lang_key,int result_calc) {

              if (lang_key.equals("arabic"))
        {
             return ""+ result_calc;
        }
        else
        {

         return     my_converResRom.convertIntegerToRoman(result_calc);

        }
    }

    public int romanToNumber(String roman) {
        this.lang_key = "roman"; //Арабский

            switch (roman) {
        case "I": return 1;
        case "II": return 2;
        case "III": return 3;
        case "IV": return 4;
        case "V": return 5;
        case "VI": return 6;
        case "VII": return 7;
        case "VIII": return 8;
        case "IX": return 9;
        case "X": return 10;

        default:  return 0;
        }

}
}