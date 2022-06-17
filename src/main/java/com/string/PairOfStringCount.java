package com.string;

import java.util.HashMap;
import java.util.Map;

/***
 * Count pair of chacter
 * i/p : aabcacadghhgaa
 * o/p a->2,h-1
 *
 */
public class PairOfStringCount {
    public static void main(String[] args) {
        String str = "aabcacadghhgaa";
        int start = 0;
        Map<Character,Integer> hm = new HashMap<>();
        while (start < str.length()-1)
        {
            char currentChar = str.charAt(start);
            if(currentChar == str.charAt(start+1))
            {
                if(hm.containsKey(currentChar))
                {
                    hm.put(currentChar,hm.get(currentChar)+1);
                }
                else
                {
                    hm.put(currentChar,1);
                }
            }
            start++;
        }
        hm.forEach((k,v)-> System.out.println(String.format("Char %c count is : %d",k,v)));
    }
}
