package recursion;
import java.util.*;
public class stringToNumber {
    public static int converter(int currentIndex, String s, int m)
    {
        if(currentIndex<0)
            return 0;
        return (s.charAt(currentIndex)-48)*m+converter(currentIndex-1,s,m*10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string : ");
        s=sc.next();
        int ans=converter(s.length()-1,s,1);
        System.out.println(ans);
    }
}
