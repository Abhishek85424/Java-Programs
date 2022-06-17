package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class JoinString {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Hi","Hello","How"));
        System.out.println(String.join("-",lst));
        StringJoiner st = new StringJoiner("-");
        st.add("Hi");
        st.add("Helllo");
        System.out.println(st.toString());
    }
}
