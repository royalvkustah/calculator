package com.company;



public class Computation {
    private final int firstNumber;
    private final int secondNumber;
    private final char operation;
    public int result;

    private static char [] allowedOperations = {'+','-','*','/'};

    public Computation(String input)
    {
        int index=SearchForOperation(input);
        this.operation=input.charAt(index);
        this.firstNumber=Integer.parseInt(input.substring(0,index).trim());
        this.secondNumber=Integer.parseInt(input.substring(index+1).trim());
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

    public static void Compute(Computation comp)
    {
        switch (comp.operation)
        {
            case '+': comp.result= comp.firstNumber+ comp.secondNumber;
                break;
            case '-':comp.result= comp.firstNumber-comp.secondNumber;
                break;
            case '*':comp.result= comp.firstNumber*comp.secondNumber;
                break;
            case '/':comp.result= comp.firstNumber/comp.secondNumber;
                break;
        }
    }
}
