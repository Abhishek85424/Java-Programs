package com.stack;

import java.util.Stack;

public class printBrackNumber {
    public static void main(String[] args) {
        String bracketStr = "[[][[[]]][][[[]]]]";
        int currentBracket = 1;
        Stack<Integer> bracket = new Stack<>();
        for(int index =0;index<bracketStr.length();index++)
        {
            if(bracketStr.charAt(index)=='[')
            {
                System.out.print(currentBracket);
                bracket.push(currentBracket);
                currentBracket++;
            }
            else
            {
                System.out.print(bracket.pop());
            }

        }
        if(!bracket.empty())
        {
            System.out.println("Invalid Bracket sequnece!!");
        }
    }
}
