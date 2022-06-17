package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class thirdHighest {


        public static int getThirdLargest(int[] a,int b){
            ArrayList <Integer> arrlist=new ArrayList<>();
            for(Integer i:a)
            {
                if(arrlist.contains(i))
                    continue;
                else
                arrlist.add(i);
            }
            Collections.sort(arrlist);
            System.out.println(arrlist+"Size:"+arrlist.size());
            return arrlist.get(b-1);
        }
        public static void main(String args[]){
            int a[]={1,2,5,6,2};
            int b[]={44,66,99,77,33,22,55};
            System.out.println("Third Largest: "+getThirdLargest(a,3));
            System.out.println("Third Largest: "+getThirdLargest(b,5));
        }
}
