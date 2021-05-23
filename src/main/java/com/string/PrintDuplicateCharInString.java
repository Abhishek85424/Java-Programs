package com.string;

import java.util.*;

public class PrintDuplicateCharInString {
    public static void main(String[] args) {
        String str = "India is my country".toLowerCase();
        List<String> allChar = new ArrayList<>(Arrays.asList(str.split("")));
        Set<String> uniqueChar = new HashSet<>(allChar);
        for(String s : uniqueChar)
        {
            int numberOfTimes = Collections.frequency(allChar,s);
            if(numberOfTimes>1)
            {
                System.out.println(String.format("Char %s is coming %d times",s,numberOfTimes));
            }
        }
    }
}
