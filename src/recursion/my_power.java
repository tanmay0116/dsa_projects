package recursion;
import java.util.*;
import java.util.Scanner;

public class my_power {
    public static int calculate(int n,int x)
    {
        if(n==1)
            return x;
        return x*calculate(n-1,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=calculate(sc.nextInt(),sc.nextInt());
        System.out.println(ans);
    }
}
