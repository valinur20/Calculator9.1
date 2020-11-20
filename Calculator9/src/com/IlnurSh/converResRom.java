package com.IlnurSh;

public class converResRom {

    static int numbers[]  = {1, 4, 5, 9, 10, 50, 100};
    static String Romans[]  = { "I", "IV", "V", "IX", "X", "L", "C"};

    private static int RomanToNumber(char letter)
    {
        switch (letter) {
            case 1:  return 'I';
            case 5:  return 'V';
            case 10 : return 'X';
            case 50 :  return 'L';
            case 100:  return 'C';
            default:   return -1;
        }
    }
    public static String convertIntegerToRoman(int number)
    {
        String romanValue = "";

        int N = number;

        while ( N > 0 )
        {
            for (int i = 0; i < numbers.length; i++)
            {
                if ( N < numbers[i] )
                {
                    N -= numbers[i-1];
                    romanValue += Romans[i-1];
                    break;
                }
            }
        }
        return romanValue;
    }
}


