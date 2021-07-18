package com.string;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "title";
        String t = "paper";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        return transform(s).equals(transform(t));
    }
    public static String transform(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        String finalStr="";
        char [] chr = s.toCharArray();
        for(int index = 0; index < chr.length; index++)
        {
            if(!hm.containsKey(chr[index]))
            {
                hm.put(chr[index],index);
            }
            finalStr += hm.get(chr[index]);

        }
        return finalStr;
    }
}

