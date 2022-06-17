package com.collection;

import java.util.Stack;

public class ReverseStringUsingStack
{
    public static void main(String[] args) {
        String  str = "xyz";
        int start = str.length()-1;
        StringBuilder sb = new StringBuilder();
        reverse(str,start,sb);
        reverse1(str);
    }
    public static void reverse(String str,int start,StringBuilder sb)
    {
        if(start<0)
        {
            System.out.println(sb);
            return;
        }
        sb.append(str.charAt(start));
        reverse(str,start-1,sb);
    }
    public static void reverse1(String str)
    {
        int currentLength = str.length()-1;
        if(str.length() == 0)
            return;
        System.out.print(str.charAt(currentLength));
        reverse1(str.substring(0,currentLength));
    }

}
