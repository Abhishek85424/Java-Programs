package com.string;

public class ToggleEachWord {
    public static void main(String[] args) {
        String str = "AbHiSHeK RaWAt";
        StringBuilder sb = new StringBuilder(str);
        int index = 0;
        for(char ch : str.toCharArray())
        {
            if(ch>='a' && ch <= 'z')
            {
                char uch = (char)('A'+ch-'a');
                sb.setCharAt(index,uch);
            }
            else if(ch>='A' && ch <= 'Z')
            {
                char lch = (char)('a'+ch-'A');
                sb.setCharAt(index,lch);
            }
            index++;
        }
        System.out.println(sb.toString());
    }
}
