package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllMethods {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        char charArr[] = {'A','B','C','D'};

//        Integer to List
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(integerList);
//        Character to List
        List<Character> characterList = Arrays.toString(charArr).chars().mapToObj(x->(char)x).collect(Collectors.toList());
        System.out.println(characterList);
    }
}
