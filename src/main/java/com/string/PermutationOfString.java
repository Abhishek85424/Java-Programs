package com.string;

public class PermutationOfString {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("XYZ");
        int index =0;
        permute(sb,index);

    }
    public static void permute(StringBuilder sb, int index)
    {

        if(index == sb.length())
        {
            System.out.println(sb);
            return;
        }
        for(int i =index;i<sb.length();i++)
        {
            // Swap Character
            swap(sb,i,index);
            permute(sb,index+1);
            swap(sb,i,index);
        }
    }
    public static void swap(StringBuilder sb,int from,int to)
    {
        char temp;
        temp = sb.charAt(from);
        sb.setCharAt(from, sb.charAt(to));
        sb.setCharAt(to,temp);
    }

}
