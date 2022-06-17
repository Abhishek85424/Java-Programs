package com.collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountPairInString {
    public static void main(String[] args) {
        String str = "aabcacadghhgaa";
        int start = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (start<str.length()-1)
        {
            char ch = str.charAt(start);
            if(ch == str.charAt(start+1))
            {
                if(hm.containsKey(ch))
                {
                    hm.put(ch,hm.get(ch)+1);
                }
                else
                {
                    hm.put(ch,1);
                }
            }
            start++;
        }
        Iterator<Map.Entry<Character,Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Character,Integer> em = iterator.next();
            System.out.println(String.format("Char %c count : %d", em.getKey(),em.getValue()));
        }
    }



}
