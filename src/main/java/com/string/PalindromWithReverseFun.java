package com.string;


public class PalindromWithReverseFun {
    public static void main(String[] args) {
        String str = "Madam";
        StringBuffer sf = new StringBuffer(str);
        sf.reverse();
        if(str.equalsIgnoreCase(sf.toString()))
            System.out.println("Palindrom");
        else
            System.out.println("Not Palindrom");
    }
}
