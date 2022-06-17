package com.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
//        Reverse each word of string
        String str = "This is Java Coding";
        List<String> revList = new ArrayList<>();
        for(String s : str.split(" "))
        {
            revList.add(new StringBuffer(s).reverse().toString());
        }
        System.out.println(String.join(" ",revList));

        // Another Approch
        String strArr[];
        strArr = str.split(" ");
        int start = 0;
        int end = strArr.length-1;
        while (start < end)
        {
            String st = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = st;
            start++;
            end--;
        }
        System.out.println(String.join(" ",strArr));
    }
}
