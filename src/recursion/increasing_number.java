package recursion;
import java.util.*;
public class increasing_number {
    public static  void calculator(int n)
    {
        if(n==0)
            return ;
        calculator(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator(sc.nextInt());
    }
}
