package com.company;



public class InputDealer {

    public static void Init(String input)
    {
        boolean isRoman=false;
        int index=Computation.SearchForOperation(input);
        char operation=input.charAt(index);
        String first=input.substring(0,index).trim();
        String second=input.substring(index+1).trim();
        try
        {
            int firstNumber=Integer.parseInt(input.substring(0,index).trim());
        }
        catch (Exception ex)
        {
            first=RomanConverter.RomanToArabic(first);
            second=RomanConverter.RomanToArabic(second);
            input=first+operation+second;
            isRoman=true;

        }
        Computation comp=new Computation(input);
        Computation.Compute(comp);
        int result=comp.result;
        if (isRoman)
        {
            System.out.println(RomanConverter.ArabicToRoman(result));
        }
        else
        {
            System.out.println(result);
        }
    }




}
