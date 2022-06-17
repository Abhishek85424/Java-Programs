package com.string;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "Today is Good day";
        for(char ch : str.toCharArray())
        {
            if(str.indexOf(ch)==str.lastIndexOf(ch))
                System.out.println(ch);
        }
    }
}
