package recursion;
import java.util.*;
public class number_of_digits {
    public static int calculator(int n)
    {
        if(n==0)
            return 0;
        return 1+calculator(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=calculator(sc.nextInt());
        System.out.println(ans);
    }
}
