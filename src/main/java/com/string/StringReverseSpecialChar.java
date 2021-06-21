package com.string;

import org.junit.Test;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class StringReverseSpecialChar {
    @Test
    public void Testing()
    {
//        Reverse a string with special character without changing special char position
//        Output :    @kesi$hb
        String str ="@bhis$ek";
        char st[] = str.toCharArray();
        int l=0, r = st.length-1;
        while (l<r)
        {
            if(!Character.isAlphabetic(st[l]))
                l++;
            else if(!Character.isAlphabetic(st[r]))
                r--;
            else
            {
                char temp = st[r];
                st[r]=st[l];
                st[l] = temp;
                l++;
                r--;
            }
        }
        str = new String(st);
        System.out.println(String.format("Reveresed String %s",str));
    }

}
