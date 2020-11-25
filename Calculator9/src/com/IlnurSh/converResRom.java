package com.IlnurSh;

public class converResRom {

    static int numbers[]  = {1, 4, 5, 9, 10, 50, 100};
    static String Romans[]  = { "I", "IV", "V", "IX", "X", "L", "C"};


    public   String convertIntegerToRoman(int number)
    {
        String romanValue = "";

        int N = number;
        int i = 0;
        while ( N > 0 )
        {
            for (i = 0; i < numbers.length; i++)
            {
                if ( N < numbers[i] )
                {

                   N -= numbers[i-1];
                    romanValue = romanValue+ Romans[i-1];
                    break;
                }
            }
        }
        return romanValue;
    }
}


