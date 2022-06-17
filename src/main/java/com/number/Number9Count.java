package com.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Number9Count {
    public static void main(String[] args) {
//        Print total occurence of 9 in range of 9-999
        int total9Count =0;
        for(int index = 9; index<=999;index++)
        {
            if(String.valueOf(index).contains("9"))
            {
                System.out.println(index);
                total9Count += Collections.frequency(Arrays.asList(String.valueOf(index).split("")),"9");
            }
        }
        System.out.println(total9Count);
        HashSet<String> hs = new HashSet<>();
        hs.add("Hi");
        hs.add("Hello");

    }
}
