package com.string;

public class SwapToStringWithoutThirdVariable {
    public static void main(String[] args) {
        String s1= "Hi";
        String s2 ="This";
        s2 = s2+s1;
        s1 = s2.substring(0,s2.length()-s1.length());
        s2 = s2.substring(s1.length());
        System.out.println(s1+" "+s2);
    }
}
