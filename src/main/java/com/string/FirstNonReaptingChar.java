package com.string;

import java.util.Collections;

public class FirstNonReaptingChar
{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        for (char ch : str.toCharArray())
        {
            if(str.indexOf(ch)==str.lastIndexOf(ch))
            {
                System.out.println(String.format("First non reapting char : %c",ch));
                break;
            }
        }
    }
}
