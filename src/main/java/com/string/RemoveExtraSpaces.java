package com.string;

public class RemoveExtraSpaces {
    public static void main(String args[])
    {
        String str = "Hi this  is      my       string             with extra     spaces";
        str = str.replaceAll("\\s+", " ");
        System.out.println(String.join(",",str.split(" ")));
    }
}
