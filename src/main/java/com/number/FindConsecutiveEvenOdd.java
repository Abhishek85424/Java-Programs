package com.number;

public class FindConsecutiveEvenOdd {
    public static void main(String[] args) {
        Integer [] a= {2,3,5,9,4,7,8};
        int evenCounter=0;
        int oddCounter=0;
        for (int val: a) {
            if(val % 2 ==0)
            {
                evenCounter++;
                oddCounter=0;
                System.out.println("even:"+evenCounter + " odd:"+oddCounter);
            }
            else if (val % 2 != 0)
            {
                oddCounter++;
                evenCounter=0;
                System.out.println("even:"+evenCounter + " odd:"+oddCounter);
            }
            if(oddCounter ==3 || evenCounter ==3)
            {
                if( oddCounter==3)
                    System.out.println("Found "+oddCounter+ " odds");
                else
                    System.out.println("found "+evenCounter+" even");
                break;
            }
        }
    }
}
