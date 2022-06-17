package com.string;

public class ReverseEachWord {
    public static void reverse(char cv[],int left,int right)
    {
        char temp;
        while (left<=right)
        {
            temp = cv[left];
            cv[left] = cv[right];
            cv[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {

        String str = "this is javatpoint";
        char charArray[] = str.toCharArray();
        int left = 0;
        for(int index =0; index < charArray.length;index++)
        {
            if(charArray[index] == ' ')
            {
                reverse(charArray,left,index-1);
                left = index + 1;
            }

        }
        reverse(charArray,left,charArray.length-1);
        System.out.println(charArray);
//        siht si tnioptavaj

    }
}
