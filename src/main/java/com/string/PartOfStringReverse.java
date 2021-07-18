package com.string;

public class PartOfStringReverse {
    public static void main(String[] args) {
        String str = "apple456shwetha2123903";
        String finalStr = "";
        int start= 0;
        int totaldigit = 0;
        while (start<str.length())
        {
            if (Character.isDigit(str.charAt(start)))
            {
                totaldigit++;
            }
            else
            {
                if(totaldigit>0)
                {
                    finalStr += new StringBuilder(str.substring(start-totaldigit,start)).reverse();
                    totaldigit = 0;
                }
                finalStr += str.charAt(start);
            }
            start++;
        }
        if(totaldigit>0)
            finalStr += new StringBuilder(str.substring(start-totaldigit,start)).reverse();
        System.out.println(finalStr);
    }
}
