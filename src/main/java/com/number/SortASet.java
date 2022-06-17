package com.number;

import java.util.*;

public class SortASet {
    public static void main(String[] args) {
        Set<Integer> s= new HashSet<>();
        s.add(7);
        s.add(1);
        s.add(3);
        ArrayList < Integer> arrylist=new ArrayList<Integer>(s);
                Collections.sort(arrylist,Comparator.reverseOrder());
        Iterator<Integer> itr= arrylist.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        for (Integer ele: arrylist ) {
            System.out.println(ele);
        }

        TreeSet <Integer> ts=new TreeSet<>(s);

        for (Integer ele: ts) {
            System.out.println(ele);
        }



    }
}
