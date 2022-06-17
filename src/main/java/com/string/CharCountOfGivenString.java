package com.string;

import java.util.*;
import java.util.stream.Collectors;

public class CharCountOfGivenString {
    public static void main(String[] args) {
        String s ="abbcdaae";
        Set<Character> distinctEle1 = new HashSet<>();
        List<Character> strList = s.chars().mapToObj(x->(char)x).collect(Collectors.toList());
//        List<Character> strList = new ArrayList<Character>(Arrays.asList(s.toCharArray()));
        Set<Character> distinctEle = new HashSet<>(strList);
        for (Character ch : distinctEle)
        {
            int charCount = Collections.frequency(strList,ch);
            System.out.println(String.format("Char : %c has count : %d",ch,charCount));
        }
        Map<Character,Integer> hs = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(hs.containsKey(ch))
                hs.put(ch,hs.get(ch)+1);
            else
                hs.put(ch,1);
        }
        for(Map.Entry<Character,Integer> entry:hs.entrySet())
        {
            System.out.println(String.format("Char %c has count : %d",entry.getKey(),entry.getValue()));
        }
    }
}
