package com.string;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CharCountOfGivenString {
    public static void main(String[] args) {
        String s ="abbcdaae";
        Set<Character> distinctEle1 = new HashSet<>();
        List<Character> strList = s.chars().mapToObj(x->(char)x).collect(Collectors.toList());
        Set<Character> distinctEle = new HashSet<>(strList);
        for (Character ch : distinctEle)
        {
            int charCount = Collections.frequency(strList,ch);
            System.out.println(String.format("Char : %c has count : %d",ch,charCount));
        }
    }
}
