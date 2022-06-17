package recursion;

public class StringPermutation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("XYZ");
        int start = 0;
        printStringPermutation(sb,start);

    }
    public static void printStringPermutation(StringBuilder sb,int start)
    {
        if(start == sb.length())
        {
            System.out.println(sb);
            return;
        }
        for(int i = start;i<sb.length();i++)
        {
            swap(sb,start,i);
            printStringPermutation(sb,start+1);
            swap(sb,start,i);
        }

    }
    public static void swap(StringBuilder sb , int start , int end)
    {
        char temp;
        temp = sb.charAt(start);
        sb.setCharAt(start,sb.charAt(end));
        sb.setCharAt(end,temp);
    }
}
