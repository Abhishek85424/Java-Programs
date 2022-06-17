package recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        printNumber1ToN(n);
        printNumberNto1(n);
    }
    public static void printNumber1ToN(int n)
    {
        if(n==0)
            return;
        printNumber1ToN(n-1);
        System.out.println(n);
    }
    public static void printNumberNto1(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        printNumberNto1(n-1);
    }
}
