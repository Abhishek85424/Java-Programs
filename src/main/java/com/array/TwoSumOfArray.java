package com.array;

import java.util.Arrays;
import java.util.HashMap;

/***
 * https://leetcode.com/problems/two-sum/
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSumOfArray {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int result[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int index = 0; index < arr.length; index++) {
            result[0] = index;
            if(hm.containsKey(target-arr[index]))
            {
                result[1] = hm.get(target-arr[index]);
                System.out.println(Arrays.toString(result));
                break;
            }
            else
            {
                hm.put(arr[index],index);
            }
        }
    }
}
