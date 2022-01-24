package recursion;
import java.util.*;
public class ChildHop {
    public static int calculate(int n)
    {
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        int s1 = calculate(n-1);
        int s2=calculate(n-2);
        int s3=calculate(n-3);
        return s1+s2+s3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        int ans=calculate(n);
        System.out.println("Answer : "+ans);
    }
}
