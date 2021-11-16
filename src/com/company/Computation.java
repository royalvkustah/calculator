package com.company;



public class Computation {
    private final int firstNumber;
    private final int secondNumber;
    private final char operation;
    public int result;

    private static char [] allowedOperations = {'+', '-','*','/'};

    public Computation(String input)
    {
//        input=input.replace(" ", "");
        System.out.println(input);
        int index=SearchForOperation(input);
        System.out.println(index);
        this.operation=input.charAt(index);
        System.out.println(operation);
        this.firstNumber=Integer.parseInt(input.substring(0,index).trim());
        System.out.println(firstNumber);
        this.secondNumber=Integer.parseInt(input.substring(index+1).trim());
        System.out.println(secondNumber);
        System.out.println(firstNumber+"__"+secondNumber+"___"+operation);

    }

    public static int SearchForOperation(String input)
    {
        int index=-1;
        for (int i=0; i<input.length(); i++)
        {
            char Ch=input.charAt(i);
            for (char allowedOperation : allowedOperations) {
                if (Ch == allowedOperation) {
                    index = i;
                    return index;
                }
            }
        }
        return index;
    }
}
