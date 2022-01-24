package recursion;
import java.util.*;
public class ReplaceCharacter {
    public static String replacer(int currentIndex, String s,char c1,char c2)
    {
        if(currentIndex==s.length())
            return s;
        if(s.charAt(currentIndex)==c1)
        {s=s.replace(c1,c2);
        }
        return replacer(currentIndex+1,s,c1,c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string : ");
        s=sc.next();
        System.out.println("Enter c1 and c2 to c1 with c2 :");
        char c1,c2;
        c1=sc.next().charAt(0);c2=sc.next().charAt(0);
        String ans = replacer(0,s,c1,c2);
        System.out.println("Final string : "+ans);
    }
}
