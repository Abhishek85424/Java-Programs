package com.number;

import java.util.Optional;

//given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//Given A = [1, 2, 3], the function should return 4.
//Given A = [−1, −3], the function should return 1.
//Write an efficient algorithm
public class SmallestPositiveNumer {

    public static void main(String[] args) {
        Optional<String> a = Optional.ofNullable("");
        if(a.isPresent())
        System.out.println("${user.dir}");
        int num[] = {1, 3, 6, 4, 1, 2}; //-1, -2,-3,5
        System.out.println(solution(num));
    }
    public static int solution(int[] num) {
        int totalItem = num.length;
        for(int index = 0; index < totalItem;index++)
        {
            int correctIndex = num[index]-1;
            while(num[index]>0 && num[index] <totalItem && num[index] != num[correctIndex])
            {
                int temp;
                temp = num[index];
                num[index] = num[correctIndex];
                num[correctIndex] = temp;
            }
        }
        for(int index = 0; index < totalItem;index++)
        {
            if(index+1 != num[index])
                return index+1;
        }
        return totalItem+1;
    }
}
