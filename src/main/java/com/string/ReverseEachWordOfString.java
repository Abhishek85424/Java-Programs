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
    }
}
