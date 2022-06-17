package com.string;

import java.util.Arrays;

public class AnagramStringValidation {
    public static void main(String args[])
    {
        String str1 = "keep";
        String str2 = "peekdf";
        str1 = str1.replaceAll("\\s","");
        str2 = str2.replaceAll("\\s","");
        if(str1.length() != str2.length())
        {
            System.out.println("Not Anangarm");
            return;
        }

        char charArrayStr1[] = str1.toCharArray();
        char charArrayStr2[] = str2.toCharArray();
        Arrays.sort(charArrayStr1);
        Arrays.sort(charArrayStr2);
        boolean status = Arrays.equals(charArrayStr1,charArrayStr2);
        if(status)
            System.out.println("Anangarm!");
        else
            System.out.println("Not Anangarm");
    }
}
