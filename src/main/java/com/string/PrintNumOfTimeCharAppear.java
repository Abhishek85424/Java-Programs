package com.string;



public class PrintNumOfTimeCharAppear {
    public static void main(String args[])
    {
        String input = "A";
        char currentChar = input.charAt(0);
        int charCount = 1;
        for (int index = 1;index < input.length();index++)
        {
            if(currentChar == input.charAt(index))
            {
                charCount++;
            }
            else
            {
                System.out.print(String.valueOf(currentChar)+charCount);
                charCount = 1;
                currentChar = input.charAt(index);
            }
        }
        System.out.println(String.valueOf(currentChar)+charCount);
    }
}
