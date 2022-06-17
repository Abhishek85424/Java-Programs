package com.number;

public class NumberPalindrom {
    public static void main(String[] args) {
        int number =121;
        int palindromNum =0;
        boolean isPalindrom = true;
        while(number != 0)
        {
            palindromNum = palindromNum *10 + number %10;
            number = number /10;
        }
        System.out.println(palindromNum);
        if(number == palindromNum)
            System.out.println("Palindrom");
        else
            System.out.println("Not a Palindrom");

//        Another Way
        String numberStr = String.valueOf(number);
        int len = numberStr.length();
        for(int index =0;index<len/2;index++)
        {
            if(numberStr.charAt(index)!=numberStr.charAt(len-1-index))
            {
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom)
            System.out.println("Palindrom");
        else
            System.out.println("Not a Palindrom");
    }
}
