package com.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k =3;
        int temp[] = new int[nums.length];
        for (int i=0;i<nums.length;i++)
        {
            temp[(i+k) % nums.length] = nums[i];
        }
        nums = temp.clone();
        Arrays.stream(nums).forEach(x->System.out.println(x));
    }
}
