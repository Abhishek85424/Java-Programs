package com.string;

public class PalindromWithoutReverseFun {
    public static void main(String[] args) {
        String str = "Madam1";
        boolean isPalindrom = true;
        for(int index =0;index < str.length()/2;index++)
        {
            if(Character.toLowerCase(str.charAt(index))!=Character.toLowerCase(str.charAt(str.length()-1-index)))
            {
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom)
            System.out.println("Palindrom");
        else
            System.out.println("Not Palindrom");
    }
}
