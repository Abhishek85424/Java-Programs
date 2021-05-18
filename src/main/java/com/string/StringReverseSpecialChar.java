package com.string;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StringReverseSpecialChar {
    @Test
    public void Testing()
    {
//        Reverse a string with special character without changing special char position
        String str ="@bhis$ek";
        HashMap<Integer,Character> hm = new HashMap<>();
        StringBuffer reverseString= new StringBuffer(str.length());

        for(int index=str.length()-1;index>=0;index--)
        {
            if(!Character.isLetter(str.charAt(index)))
           for(int key : hm.keySet())
           {
               reverseString.insert(key,hm.get(key));
           }
        }
        System.out.println(String.format("Reveresed String %s",reverseString));
    }

}
