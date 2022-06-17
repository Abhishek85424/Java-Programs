package com.array;

import java.util.Random;

public class ShuffleElement {
    public static void main(String[] args) {
        int arr[] = new int[100];
        for(int i=0;i<100;i++)
        {
            arr[i] = i+1;
        }
//        Shuffle Elements
        int temp;
        Random rm = new Random();
        for(int i=0;i<100;i++)
        {
            int k = rm.nextInt(100);
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
//        Print array
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
