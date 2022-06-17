package com.array;

import java.util.Arrays;

/***
 * https://leetcode.com/problems/shuffle-the-array/
 *  1470 problem number
 *  Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class ShuffleTheArray {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        int n =3;
        int result[] = new int[arr.length];
        for(int index = 0; index < n; index++)
        {
            result[2*index] = arr[index];
            result[2*index+1] = arr[index+n];
        }
        System.out.println(Arrays.toString(result));

    }
}
