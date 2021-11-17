package com.company;

public class RomanConverter {

    static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        return -100;
    }

    public static String RomanToArabic(String input)
    {
        int number=0;
        for (int i = 0; i < input.length(); i++)
        {
            int s1 = value(input.charAt(i));
            if (i + 1 < input.length())
            {
                int s2 = value(input.charAt(i + 1));
                if (s1 >= s2)
                {
                    number+= s1;
                }
                else
                {
                    number += s2 - s1;
                    i++;
                }
            }
            else {
                number += s1;
            }
        }
        return String.valueOf(number);
    }

    public static String ArabicToRoman(int number)
    {
        int[] values = {100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();
        for(int i=0; i<values.length; i++)
        {
            while(number >= values[i])
            {
                number -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }


}
