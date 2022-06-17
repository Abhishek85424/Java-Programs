package com.array;

import java.util.Arrays;

public class MedianOfTwoArray {
    public static void main(String[] args) {
        int nums1[] = {1,2}, nums2[] = {3,4};
        int finalArray[] = new int[nums1.length+nums2.length];
        int aptr = 0;
        int bptr = 0;
        int index = 0;
        while(aptr < nums1.length && bptr < nums2.length)
        {
            if(nums1[aptr] <= nums2[bptr])
            {
                finalArray[index] =  nums1[aptr++];
            }
            else
            {
                finalArray[index] =  nums2[bptr++];
            }

            index++;
        }
        while (aptr < nums1.length)
        {
            finalArray[index] =  nums1[aptr++];
            index++;
        }
        while (bptr < nums2.length)
        {
            finalArray[index] =  nums2[bptr++];
            index++;
        }
        double median;
        if(finalArray.length % 2 != 0)
            median = finalArray[finalArray.length / 2];
        else
            median = (double)(finalArray[finalArray.length / 2] + finalArray[(finalArray.length / 2)-1])/2;
        System.out.println(String.format("Median is %f",median));
        System.out.println(Arrays.toString(finalArray));
    }
}
