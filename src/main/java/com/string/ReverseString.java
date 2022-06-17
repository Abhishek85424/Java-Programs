package com.string;

public class ReverseString {
    public static void main(String args[])
    {
        String str = "this is javatpoint";
        char []charArray = str.toCharArray();
        int start_index,end_index;
        start_index = 0;
        end_index = str.length()-1;
        char ch;
        while(start_index < end_index)
        {
            ch = charArray[start_index];
            charArray[start_index] = charArray[end_index];
            charArray[end_index] = ch;
            start_index += 1;
            end_index -=  1;
        }
        System.out.println(new String(charArray));

    }
}
