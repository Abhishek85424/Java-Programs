package com.string;

public class MaxAndMinLenghString {
    public static void main(String[] args) {
        String str = "Hello this is successful string";
        String max="",min="";
        boolean first = true;
        for(String word : str.split(" "))
        {
            if(first)
            {
                first = false;
                min = word;
                max = word;
            }
            else
            {
                if(word.length() > max.length())
                    max = word;
                if(word.length() < min.length())
                    min = word;
            }
        }
        System.out.println(String.format("Max length string : %s and min length string : %s",max,min));
    }
}
